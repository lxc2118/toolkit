package com.fastwebx.web.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import com.fastwebx.common.util.FileHelpUtil;
import com.fastwebx.common.util.InputStreamUtil;

import junit.framework.TestCase;

/**
 * @author mj
 */
public class HttpUtilTest extends TestCase {

	public void testPost() throws FileNotFoundException {
		Map<String,String> map = new HashMap<String,String>();
		map.put("aaa", "123456");
		String s = InputStreamUtil.stream2String(new FileInputStream("f:/Noname1.txt"),"gbk");
		map.put("bbb", s);
		String result =(HttpUtil.post("http://127.0.0.1:8080/admin/login/login.jsp"
				, map));
		FileHelpUtil.write(new File("f:/test.txt"), result);
	}
	
	public void testUpdate(){
		String result =HttpUtil.upload(
				"http://127.0.0.1:8080/admin/javaSaveZip.do"
				,"upload_file"
				,new File("F://cocos//sanguo//bao.zip")
				,null
		);
		System.out.println(result);
	}

}
