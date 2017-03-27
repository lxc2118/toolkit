package com.fastwebx.web.util.entry;

import java.io.File;
import java.util.HashMap;

import com.fastwebx.common.util.FileHelpUtil;
import com.fastwebx.web.util.entry.cookie.AbsCookieProcess;

import junit.framework.TestCase;

/**
 * @author mj
 */
public class HttpEntryTest extends TestCase {

	public void testPost() {
		HttpEntry he = new HttpEntry()
			.setUrl("http://192.168.2.250/admin//loginAdminUser.do");
		Cp cp = new Cp();
		he.addCookieCsm(cp);
		he.putParam("adminId", "admin")
			.putParam("pswd", "123456");
		
		String result = he.submit();
		System.out.println(result);
		System.out.println("============================");
		HttpEntry he2 = new HttpEntry()
			.setUrl("http://192.168.2.250/admin//saveZipFile.do");
		he2.setCookie(cp.map);
		result = he2.upload("upload_file", new File("F://cocos//sanguo//bao.zip"));
		System.out.println(result);
	}
 
	class Cp extends AbsCookieProcess{
		private HashMap<String, String> map = new HashMap<>();
		@Override
		protected void doProcess(String key, String value) {
			map.put(key, value);
		}
		
	}
}
