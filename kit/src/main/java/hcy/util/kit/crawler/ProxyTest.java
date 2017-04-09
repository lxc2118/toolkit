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
		new HttpReq("http://1212.ip138.com/ic.asp").setProxy(true).execute();
	}

}
