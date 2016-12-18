package util;

public class NameUtil {
	static public String buildName(Class clazz,String suffix){
		String className = clazz.getSimpleName();
		StringBuffer sb = new StringBuffer();
		sb.append(className.substring(0,1).toLowerCase())
			.append(className.substring(1));
		if(suffix!=null)
			sb.append(suffix);
		return sb.toString();
	}
}
