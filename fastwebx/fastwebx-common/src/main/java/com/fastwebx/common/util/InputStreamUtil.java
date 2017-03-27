package com.fastwebx.common.util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import com.fastwebx.common.inf.IProcessor;

/**
 * 二进制输入流工具类
 * @author mj
 */
public class InputStreamUtil {
	
	/**
	 * 读取二进制流
	 * @param bs
	 * @param processor
	 * @param encode 字符集编码
	 */
	public static void process(InputStream stream,IProcessor<String> processor,String encode){
		if(stream==null || processor==null) return;
		
		
		BufferedReader reader=null;
		
		try {
			reader = new BufferedReader(new InputStreamReader(stream,encode));
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		
		String s = null;
		try {
			if(reader!=null){
				while((s=reader.readLine())!=null){
					processor.process(s);
				}
				reader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 读取二进制流
	 * @param bs
	 * @param processor
	 */
	public static void process(InputStream stream,IProcessor<String> processor){
		if(stream==null || processor==null) return;
		
		
		BufferedReader reader=null;
		
		reader = new  BufferedReader(new InputStreamReader(stream));
		
		String s = null;
		try {
			if(reader!=null){
				while((s=reader.readLine())!=null){
					processor.process(s);
				}
				reader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static byte[] getBytes(InputStream stream){
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		BufferedInputStream bis = new BufferedInputStream(stream);
		stream.mark(0);
		byte[] bs = new byte[1024];
		int i=0;
		try {
			while((i=stream.read(bs))>0){
				out.write(bs, 0, i);
			}
			out.close();
			bis.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		return out.toByteArray();
	}
	
	public static String stream2String(InputStream stream){
		return new String(getBytes(stream));
	}
	
	public static String stream2String(InputStream stream,String charset){
		try {
			return new String(getBytes(stream),charset);
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}
}
