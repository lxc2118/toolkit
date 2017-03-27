package com.fastwebx.common.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.fastwebx.common.inf.IProcessor;

import junit.framework.TestCase;

/**
 * @author mj
 */
public class InputStreamUtilTest extends TestCase {
	public void testGetBytes(){
		String s = "测试一下看看";
		ByteArrayInputStream in = new ByteArrayInputStream(s.getBytes());
		System.out.println(new String(InputStreamUtil.getBytes(in)));
		System.out.println(new String(InputStreamUtil.getBytes(in)));
	}
	public void testGetBytes2(){
	
		FileInputStream in=null;
		try {
			in = new FileInputStream("f:/2.txt");
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		System.out.println(new String(InputStreamUtil.getBytes(in)));
		System.out.println(new String(InputStreamUtil.getBytes(in)));
	}
}
