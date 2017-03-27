package com.fastwebx.codeAuto.codeCreater;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;

import com.fastwebx.db.test.TestBase;

public class ResourceTest extends TestBase {
	public void testFind() throws Exception{
		System.out.println( ClassLoader.getSystemResource(("templet/addAction.vm")));
		InputStream in = ClassLoader.getSystemResourceAsStream("templet/addAction.vm");
		int i=0;
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		while((i=in.read())!=-1){
			out.write(i);
		}
		System.out.println(new String(out.toByteArray()));
		
		File file = new File(ClassLoader.getSystemResource("templet/addAction.vm").toURI());
		System.out.println(file.getName());
	}
}
