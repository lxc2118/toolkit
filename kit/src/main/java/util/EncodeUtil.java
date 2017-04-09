package util;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/**
 * TODO 待修改
 * @author lxc
 */
public class EncodeUtil {
	
	/**
	 * 字符串encode转换
	 * @param str
	 * @param type
	 * @param encodeType
	 * @return
	 */
	public static String encode(String str, String type, String encodeType) {
		String temp = null;
		try {
			temp = new String(str.getBytes(type), encodeType);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} 
		return temp;
	}
	
	/**
	 * 判断文件编码 有一定概率出错
	 * 
	 * @param bis
	 * @return
	 */
	public static String getCharset(InputStream bis) {
		String charset = "GBK";
		try {

			int read;
			int loc = 0;

			while ((read = bis.read()) != -1) {
				loc++;
				if (read >= 0xF0)
					break;
				if (0x80 <= read && read <= 0xBF) // 单独出现BF以下的，也算是GBK
					break;
				if (0xC0 <= read && read <= 0xDF) {
					read = bis.read();
					if (0x80 <= read && read <= 0xBF) // 双字节 (0xC0 - 0xDF)
						continue;
					else
						break;
				} else if (0xE0 <= read && read <= 0xEF) {// 也有可能出错，但是几率较小
					read = bis.read();
					if (0x80 <= read && read <= 0xBF) {
						read = bis.read();
						if (0x80 <= read && read <= 0xBF) {
							charset = "UTF-8";
							break;
						} else
							break;
					} else
						break;
				}
			}
			bis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return charset;
	}

}
