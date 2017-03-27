package com.fastwebx.common.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.imageio.stream.FileImageOutputStream;

import com.fastwebx.common.inf.IProcessor;

import junit.framework.TestCase;

/**
 * @author mj
 */
public class EncodeUtilTest extends TestCase {
	
	
	public void testGet() throws FileNotFoundException, UnsupportedEncodingException{
		FileInputStream in = new FileInputStream("d:/3.txt");
		System.out.println(EncodeUtil.getCharset(in));
	}
}
