package test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import util.Md5Util;
import util.SaltUtil;

/**
 * Created by Axios on 2016/10/21.
 */
public class ItemPropHelper {

    public static String sort(String propJson) {
        String [] props = propJson.split(";");
        TreeMap<String, String> map = new TreeMap<String, String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (Long.parseLong(o1)>Long.parseLong(o2))
                    return -1;
                return 1;
            }
        });
        StringBuffer sb = new StringBuffer();
        for (String prop: props){
            String [] temp = prop.split(":");
            map.put(temp[0], temp[1]);
        }
        Iterator it=map.entrySet().iterator();  
        while(it.hasNext()){  
            Map.Entry entry=(Map.Entry)it.next();  
            String key=entry.getKey().toString();  
            String val=entry.getValue().toString();  
            sb.append(key+":"+val+";"); 
        }
        String str = sb.toString().substring(0,sb.lastIndexOf(";"));
        return str;
    }
    
    public static String encode(byte[] source) {  
        String s = null;  
        char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',  
                'a', 'b', 'c', 'd', 'e', 'f' };// 用来将字节转换成16进制表示的字符  
        try {  
            MessageDigest md = java.security.MessageDigest  
                    .getInstance("MD5");  
            md.update(source);  
            byte tmp[] = md.digest();// 计算结果是一个 128位的长整数  
            System.out.println(new String(tmp));
            char str[] = new char[16 * 2];// 每个字节用 16 进制表示的话，使用两个字符， 所以表示成 16  
            int k = 0;// 表示转换结果中对应的字符位置  
            for (int i = 0; i < 16; i++) {// 从第一个字节开始，对 MD5 的每一个字节// 转换成 16  
               byte byte0 = tmp[i];// 取第 i 个字节  
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];// 取字节中高 4 位的数字转换,// >>>  
                str[k++] = hexDigits[byte0 & 0xf];// 取字节中低 4 位的数字转换  
            }  
            s = new String(str);// 换后的结果转换为字符串  
  
        } catch (NoSuchAlgorithmException e) {  
            e.printStackTrace();  
        }  
        return s;  
    } 

    public static void main(String[] args) {
//		System.out.println(sort("1:2;2:3;0:0"));
//    	String str = encode("123".getBytes());
//    	String pass = "123";
//    	System.out.println(Md5Util.encode(pass+pass.hashCode()));
//    	System.out.println(str);
//    	System.out.println("123".hashCode());
    	System.out.println(SaltUtil.getSalt(10));
//    	;
	}
}
