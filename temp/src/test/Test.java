package test;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Test {

    public static String sort(String propJson) {
        String [] props = propJson.split(";");
        Map<Long, String> map = new TreeMap<>(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                if (o1>o2)
                    return -1;
                return 1;
            }
        });
        StringBuffer sb = new StringBuffer();
        for (String prop: props){
            String [] temp = prop.split(":");
            map.put(Long.parseLong(temp[0]), temp[1]);
        }
        for(String str:map.values()){
        	System.out.println(str);
        }
        
        return null;
    }
	
    
    
	public static void main(String[] args) {
		
	}
}
