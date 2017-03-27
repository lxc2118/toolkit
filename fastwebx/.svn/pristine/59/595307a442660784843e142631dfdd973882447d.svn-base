package com.fastwebx.common.util;

import java.io.File;

import com.fastwebx.common.inf.IProcessor;

import junit.framework.TestCase;

/**
 * @author mj
 */
public class FileHelpUtilTest extends TestCase {

	public void testClearDir() {
		FileHelpUtil.clearDir("d:/json");
	}
	
	public void testListFile(){
		IProcessor<File> processor = new IProcessor<File>() {

			@Override
			public void process(File pojo) {
				System.out.println(pojo.getPath());
				
			}
			
		};
		FileHelpUtil.listFile(new File("D:/json/unzip/sanguo"), processor);
	}
	
	public void testFile2bytes(){
		byte[] bytes = FileHelpUtil.file2bytes(new File("f:/cocos/sanguo.rar"));
		System.out.println(bytes.length);
	}

	
	public void test2bytes(){
		File f = new File("f:/1.txt");
		byte[] bs = FileHelpUtil.getBytes(f);
		String s = new String(bs);
		System.out.println(s);
	}
	
	public void testCopy(){
		FileHelpUtil.copy("d:/json/", "d:/json1/");
	}
	
	public void testBuildFullFile(){
		String s = FileHelpUtil.buildFullName("d:/json/", "aa","b.txt");
		System.out.println(s);
	}
}
