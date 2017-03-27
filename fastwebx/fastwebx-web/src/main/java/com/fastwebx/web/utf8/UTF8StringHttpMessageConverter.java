package com.fastwebx.web.utf8;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.StreamUtils;

public class UTF8StringHttpMessageConverter extends StringHttpMessageConverter {

	private static final MediaType utf8 = new MediaType("text", "plain",
		 Charset.forName("UTF-8"));
	private static final List<Charset> list = new ArrayList<Charset>();
	static{
		list.add(utf8.getCharSet());
	}
	private boolean writeAcceptCharset = true;

	@Override
	protected MediaType getDefaultContentType(String dumy) {
		return utf8;
	}
	
	
	protected List<Charset> getAcceptedCharsets() {
		return list;
	}

	protected void writeInternal(String s, HttpOutputMessage outputMessage)
			throws IOException {
		if(s==null) s="";
		Charset charset = utf8.getCharSet();
		byte[] bytes = s.getBytes(charset);
		if (this.writeAcceptCharset) {
			outputMessage.getHeaders().setAcceptCharset(getAcceptedCharsets());
			outputMessage.getHeaders().setContentLength(bytes.length);
		}
		
		outputMessage.getBody().write(bytes);
		
		outputMessage.getBody().flush();
		
	}

	public boolean isWriteAcceptCharset() {
		return writeAcceptCharset;
	}

	public void setWriteAcceptCharset(boolean writeAcceptCharset) {
		this.writeAcceptCharset = writeAcceptCharset;
	}

}
