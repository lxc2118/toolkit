package com.fastwebx.common.util;

import java.util.ArrayList;
import java.util.List;

public class StrUtil {
	/**
	 * 链接字符串
	 * @param strs
	 * @return
	 */
	public static String join(Object ...strs ){
		if(strs==null) return null;
		StringBuilder sb = new StringBuilder();
	
		for(Object str:strs){
			if(str!=null){
				
				sb.append(str);
			}
		}
		return sb.toString();
	}
	/**
	 * 链接字符串 用“，”隔开
	 * @param strs
	 * @return
	 */
	public static String link(Object ... strs){
		if(strs==null) return null;
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for(Object str:strs){
			if(str!=null){
				if(!first){
					sb.append(",");
				}else{
					first = false;
				}
				sb.append(str);
			}
		}
		return sb.toString();
	}
	
	public static String linkWithSpace(Object ... strs){
		return linkWithSplit(" ",strs);
	}
	
	public static String linkWithSplit(String split,Object ... strs){
		if(strs==null) return null;
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for(Object str:strs){
			if(str!=null){
				if(!first){
					sb.append(split);
				}else{
					first = false;
				}
				sb.append(str);
			}
		}
		return sb.toString();
	}
	
	public static String isNull(String value,Object obj){
		if(value!=null && !"".equals(value)) return value;
		return obj.toString();
	}
	
	/**
	 *增加前缀
	 * @param prefix
	 * @param str
	 * @return
	 */
	public static String addPrefix(String prefix,Object str){
		StringBuilder sb = new StringBuilder();
		if(prefix!=null)
			sb.append(prefix);
		sb.append(str);
		return sb.toString();
	}
	/**
	 * 不使用正则表达式进行split 效率更高
	 * @param str
	 * @param c
	 * @return
	 */
	static public List<String> split(String str,char c){
		List<String> list = new ArrayList<String>();
		int index = str.indexOf(c);
		while(index!=-1){
			list.add(str.substring(0,index));
			str = str.substring(index+1);
			index = str.indexOf(c);
		}
		list.add(str);
		return list;
	}
	
	public static boolean isEmpty(String s){
		return s==null || "".equals(s);
	}
	
	/**
	 * 替换字符
	 * @param src
	 * @param oldChar
	 * @param newChar
	 * @return
	 */
	public static String replaceAll(String src,char oldChar,char newChar){
		
		if(src==null || oldChar==newChar) return src;
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<src.length();i++){
			char c=src.charAt(i);
			if(c!=oldChar){
				sb.append(c);
			}else{
				sb.append(newChar);
			}
		}
		return sb.toString();
	}
	
	/**
	 * 删除字符串所有
	 * @param src
	 * @param oldChar
	 * @param newChar
	 * @return
	 */
	public static String removeAll(String src,char oldChar){
		
		if(src==null ) return src;
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<src.length();i++){
			char c=src.charAt(i);
			if(c!=oldChar){
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
