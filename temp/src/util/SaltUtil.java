package util;

import java.util.Random;

public class SaltUtil {

	private static final String seaWater = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789";
	
	
	/**
	 * 生成一个一定位数的随机字符串
	 * @return
	 */
	public static String getSalt(int length) {
	    Random random = new Random();   
	    StringBuffer sb = new StringBuffer();   
	    for (int i = 0; i < length; i++) {   
	        int number = random.nextInt(seaWater.length());   
	        sb.append(seaWater.charAt(number));   
	    }   
	    return sb.toString(); 
	}
}
