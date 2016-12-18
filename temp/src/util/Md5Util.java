package util;

import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Util {
	
	public static String encode(String source) {  
       if(source==null) return null;
       return encode(source.getBytes());
    }
	
	public static String encodeFile(File file){
		return encode(FileHelpUtil.file2bytes(file));
	}
	
	public static String encode(byte[] source) {  
        String s = null;  
        char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',  
                'a', 'b', 'c', 'd', 'e', 'f' };// 用来将字节转换成16进制表示的字符  
        try {  
            MessageDigest md = java.security.MessageDigest  
                    .getInstance("MD5");  
            md.update(source);  
            byte tmp[] = md.digest();// MD5 的计算结果是一个 128 位的长整数，  
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
	
	
}
