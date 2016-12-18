package util;

import java.util.HashMap;

public class MapUtil {

	public static HashMap<String, String> parse(String str) {
		HashMap<String, String> map = new HashMap<>();
		for(String s:str.split("&")){
			String[] ss = s.split("=");
			map.put(ss[0], ss[1]);
		}
		return map;
	}
	
    /**
     * 取出Map中所有key的值，返回map
     * @return
     */
//    public static HashMap<String, ?> getMapByKeys(HashMap<String, ?> map, String[] keys){
//        HashMap<String, ?> m = new HashMap<String, ?>();
//        for(String k:keys)
//            if(map.get(k)!=null)
//                m.put(k,map.get(k));
//        return m;
//    }
	
//	public static HashMap<String, String> parse(String str) {
//		HashMap<String, String> map = new HashMap<>();
//		for(String s:str.split("&")){
//			String[] ss = s.split("=");
//			map.put(ss[0], ss[1]);
//		}
//		return map;
//	}
}
