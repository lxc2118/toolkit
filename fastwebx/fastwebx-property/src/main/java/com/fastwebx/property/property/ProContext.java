package com.fastwebx.property.property;
import java.io.InputStream;
import java.util.HashMap;

public class ProContext {
	protected static HashMap<String, String> files = new HashMap<String,String>();
	
	
	public static String setFileName(String arg0, String arg1) {
		return files.put(arg0, arg1);
	}
	public static InputStream getStream(Class clazz){
		
		return ProContext.class.getResourceAsStream(getFileName(clazz));
	}
	/**
	 * 找到filename
	 * @param clazz
	 * @return
	 */
	protected static String getFileName(Class clazz){
		String simpleName = clazz.getSimpleName();
		String ret = files.get(simpleName);
		if(ret == null){
			ret = "/"+simpleName +".properties";
		}
		return ret;
	} 
}
