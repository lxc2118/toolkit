package hcy.util.kit.crawler;

import hcy.util.kit.http.HttpReq;

public class JingTest {
//	form[wsiteGuid]:x2z0wu
//	form[pageId]:4
//	form[elemId]:16
//	form[name]:标题
	public static void main(String[] args) {
//		PHPSESSID=tbrpr5k4ocer95i4a2vte92o42; expires=Mon, 12-Jun-2017 10:57:56 GMT; Max-Age=7200; path=/; domain=.rrxiu.net
		for(int i=0;i<300;i++) {
			String html = new HttpReq("https://www.rrxiu.net/view-x2z0wu")
			.setMethod("post")
			.setCookie("PHPSESSID","r3fno8a7pgi6tm809est3vsov3")
			.put("wsiteGuid", "x2z0wu")
			.put("pageId", "4")
			.put("elemId", "17")
			.put("name", "标题").execute();
			System.out.println(i + "===" + html);
		}
	}
}
