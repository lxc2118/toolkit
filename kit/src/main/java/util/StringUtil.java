package util;

public class StringUtil {

	public static String getGetMethod(String methodName){
		return "get" + methodName.substring(0,1).toUpperCase() + methodName.substring(1);
	}
	
	public static String getSetMethod(String methodName){
		return "set" + methodName.substring(0,1).toUpperCase() + methodName.substring(1);
	}
}
