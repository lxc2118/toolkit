package hcy.util.kit.test;

import java.io.UnsupportedEncodingException;

public class EncodeTest {

	public static void main(String[] args) throws Exception {
		String gbk = "iteye问答频道编码转换问题";

		String iso = new String(gbk.getBytes("UTF-8"), "ISO-8859-1");

		System.out.println(iso);

		String utf8 = new String(iso.getBytes("ISO-8859-1"), "UTF-8");
		System.out.println(utf8);

		System.out.println(getUTF8StringFromGBKString(gbk));
	}

	public static String getUTF8StringFromGBKString(String gbkStr) {
		try {
			return new String(getUTF8BytesFromGBKString(gbkStr), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new InternalError();
		}
	}

	public static byte[] getUTF8BytesFromGBKString(String gbkStr) {
		int n = gbkStr.length();
		byte[] utfBytes = new byte[3 * n];
		int k = 0;
		for (int i = 0; i < n; i++) {
			int m = gbkStr.charAt(i);
			if (m < 128 && m >= 0) {
				utfBytes[k++] = (byte) m;
				continue;
			}
			utfBytes[k++] = (byte) (0xe0 | (m >> 12));
			utfBytes[k++] = (byte) (0x80 | ((m >> 6) & 0x3f));
			utfBytes[k++] = (byte) (0x80 | (m & 0x3f));
		}
		if (k < utfBytes.length) {
			byte[] tmp = new byte[k];
			System.arraycopy(utfBytes, 0, tmp, 0, k);
			return tmp;
		}
		return utfBytes;
	}


	public static void gbk2Utf() throws UnsupportedEncodingException {
		String gbk = "我来了";
		char[] c = gbk.toCharArray();
		byte[] fullByte = new byte[3 * c.length];
		for (int i = 0; i < c.length; i++) {
			String binary = Integer.toBinaryString(c[i]);
			StringBuffer sb = new StringBuffer();
			int len = 16 - binary.length();
			// 前面补零
			for (int j = 0; j < len; j++) {
				sb.append("0");
			}
			sb.append(binary);
			// 增加位，达到到24位3个字节
			sb.insert(0, "1110");
			sb.insert(8, "10");
			sb.insert(16, "10");
			fullByte[i * 3] = Integer.valueOf(sb.substring(0, 8), 2).byteValue();// 二进制字符串创建整型
			fullByte[i * 3 + 1] = Integer.valueOf(sb.substring(8, 16), 2).byteValue();
			fullByte[i * 3 + 2] = Integer.valueOf(sb.substring(16, 24), 2).byteValue();
		}
		// 模拟UTF-8编码的网站显示
		System.out.println(new String(fullByte, "UTF-8"));
	}
}
