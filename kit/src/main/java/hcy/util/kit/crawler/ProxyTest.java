package hcy.util.kit.crawler;

import hcy.util.kit.http.HttpReq;

/**
 * ip代理服务器抓取
 * proxy在新项目中ebean已实现
 * TODO 非ebean，如何使用mybatis或者其他数据源进行代理ip注入
 * @author lxc
 *
 */
public class ProxyTest {

	
	public static void main(String[] args) {

//		System.setProperty("http.maxRedirects", "50");
//		System.getProperties().setProperty("proxySet", "true");
//		System.getProperties().setProperty("http.proxyHost", "93.91.200.146");  
//		System.getProperties().setProperty("http.proxyPort", "80"); 
//		System.out.println(ProxyTest.getHtml("http://1212.ip138.com/ic.asp"));
		// 正常访问
//		new HttpReq("http://1212.ip138.com/ic.asp").execute();
		// 设置代理
//		new HttpReq("http://1212.ip138.com/ic.asp").setProxy().execute();
//		HttpReq req = new HttpReq("http://1212.ip138.com/ic.asp").setCookie("1", "1").setCookie("1", "2");
//		System.out.println(1);
		
//		String html = new HttpReq("https://tcc.taobao.com/cc/json/mobile_tel_segment.htm").put("tel","13575883421").execute();
//		System.out.println(html);
		
//		String html = new HttpReq("https://www.kuaidi100.com/query")
//				.put("type","yunda")
//				.put("postid","3900778482478").execute();
		
		String html = new HttpReq("http://www.6pan.cc/down-152992.html").execute();
		System.out.println(html);

		
	}

}
