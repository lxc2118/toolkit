package util;

import org.apache.poi.ss.formula.functions.T;

import java.util.List;

/**
 * Created by lxc on 2017/3/10.
 */
public class ListUtil {

	/**
	 * list用,分隔
	 * @param list
	 * @return
	 */
    public static <T> String toString(List<T> list) {
    	return split(list, ",");
    }
    
    /**
     * list用任意符号分隔
     * @param list
     * @param symbol
     * @return
     */
    public static <T> String split(List<T> list, String symbol) {
        StringBuffer sb = new StringBuffer();
        for (T t : list) {
            sb.append(t.toString()+ symbol);
        }
        return sb.substring(0,sb.length()-symbol.length()).toString();
    }
}
