package util;

import java.util.HashMap;

/**
 * Created by Axios on 2016/11/30.
 */
public class MapUtil {

    /**
     * 取出Map中所有key的值，返回map
     * @return
     */
    public static HashMap<String, String> filterKeys(HashMap<String, String> map, String[] keys){
        HashMap<String, String> m = new HashMap<String, String>();
        for(String k:keys)
            if(map.get(k)!=null)
                m.put(k,map.get(k));
        return m;
    }
}
