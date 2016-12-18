package util;
/**
 * @author mj
 */
public class ArrayUtil {
	public static String getStr(String[] array,int index,String def){
		if(array==null) return def;
		if(index>=array.length) return def;
		return array[index];
	}
}
