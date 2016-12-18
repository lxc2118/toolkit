package util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Axios on 2016/11/30.
 */
public class ReqUtil {

    /**
     * 将网址后传参map化
     * @return map
     */
    public static HashMap<String, String> parseQueryString(String qs) {
        HashMap<String, String> map = new HashMap<>();
        for (String s : qs.split("&")) {
            String[] tmp = s.split("=");
            map.put(tmp[0], tmp[1]);
        }
        return map;
    }

    /**
     * map网址后传参化
     * @return string
     * TODO 可能存在url编译query问题，待解决
     */
    public static String parseParams(Map<String,String> map){
        StringBuffer sb = new StringBuffer();
        for (String key: map.keySet()){
            sb.append(key+"="+map.get(key)+"&");
        }
        return sb.substring(0,sb.length()-1).toString();
    }
    
    public static String parseParams(List<String> list){
        StringBuffer sb = new StringBuffer();
        for (String str: list){
            sb.append(str + ",");
        }
        return sb.substring(0,sb.length()-1).toString();
    }
}
