package com.fastwebx.common.util;

import java.util.List;

import junit.framework.TestCase;

/**
 * @author mj
 */
public class StrUtilTest extends TestCase {
	public void testSplit(){
		List<String> strs = StrUtil.split("jj,lll,io", '|');
		System.out.println("len="+strs.size());
		for(String str:strs){
			System.out.println(str);
		}
	}
	
	public void testSplit2(){
		List<String> strs = StrUtil.split("jj,lll,io", ',');
		System.out.println("len="+strs.size());
		for(String str:strs){
			System.out.println(str);
		}
	}
	public void testSplit3(){
		List<String> strs = StrUtil.split(",lll,io", ',');
		System.out.println("len="+strs.size());
		for(String str:strs){
			System.out.println(str);
		}
	}
	
	public void testSplit4(){
		List<String> strs = StrUtil.split(",lll,io,", ',');
		System.out.println("len="+strs.size());
		for(String str:strs){
			System.out.println(str);
		}
	}
	
	public void testReplace(){
		String s="D:\\workspace\\hexagon\\hhhh\\";
		String n = s.replace('\\', '/');
		System.out.println(n);
	}
	
	public void testRemoveAll(){
		String s = "你好啊，你真是好孩子";
		System.out.println(StrUtil.removeAll(s, '好'));
		System.out.println(StrUtil.replaceAll(s, '好','坏'));
	}
	
	public void testRemoveAll2(){
		String s = "adsafdsafdsaf";
		System.out.println(StrUtil.removeAll(s, 'a'));
		System.out.println(StrUtil.replaceAll(s, 'a','b'));
	}
	
	public void testRemoveAll3(){
		String s = "cccc";
		System.out.println(StrUtil.removeAll(s, 'a'));
		System.out.println(StrUtil.replaceAll(s, 'a','b'));
	}
	
	public void testRemoveAll4(){
		String s = "adsafdsafdsaf";
		for(int i=0;i<10000000;i++){
			StrUtil.removeAll(s, 'a');
			StrUtil.replaceAll(s, 'a','b');
		}
	}
	
	public void testReplaceAll(){
		String s= "${123}ddd${test} dd${123}";
		System.out.println(s=s.replace("${123}", "abc"));
		System.out.println(s=s.replace("${test}", "sanguo"));
		
	}
}
