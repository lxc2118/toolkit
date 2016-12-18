package util;

import java.util.function.Function;

/**
 * @author mj
 */
public class ValueUtil {
	public static Double getDouble(String str){
	
		Double ret = calValue(str,Double::parseDouble);
		return ret;
	}
	
	public static Long getLong(String str){
	
		Long ret = calValue(str,Long::parseLong);
		return ret;
	}
	
	public static Integer getInt(String str){
		
		Integer ret = calValue(str,Integer::parseInt);
		return ret;
	}
	
	/**
	 * 具体计算
	 * @param str
	 * @param fun
	 * @return
	 */
	private static <T> T calValue(String str,Function<String, Object> fun){
		if(str==null || str.equals("")) return null;
		T t = null;
		try{
			t = (T)fun.apply(str);
		}catch(Exception e){
			
		}
		return t;
	}  
}
