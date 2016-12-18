package hcy.util.kit.crawler;

import java.io.BufferedInputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.URL;
import java.net.URLConnection;

import hcy.util.kit.http.HttpReq;

public class ProxyTest {

	public static void main(String[] args) {

//		System.setProperty("http.maxRedirects", "50");
//		System.getProperties().setProperty("proxySet", "true");
//		System.getProperties().setProperty("http.proxyHost", "93.91.200.146");  
//		System.getProperties().setProperty("http.proxyPort", "80"); 
//		System.out.println(ProxyTest.getHtml("http://1212.ip138.com/ic.asp"));
		new HttpReq("http://1212.ip138.com/ic.asp").setProxy(true).execute();
	}
	
	public static String getHtml(String address){
		StringBuffer html = new StringBuffer();
		String result = null;
//		SocketAddress addr = new InetSocketAddress("93.91.200.146", 80); 
//		Proxy proxy = new Proxy(Proxy.Type.HTTP, addr);
		try{
			URL url = new URL(address);
//			URLConnection conn = url.openConnection(proxy);
			URLConnection conn = url.openConnection();
			conn.setRequestProperty("User-Agent","Mozilla/4.0 (compatible; MSIE 7.0; NT 5.1; GTB5; .NET CLR 2.0.50727; CIBA)");
			System.out.println("123");
			System.out.println(conn.getContent());
			BufferedInputStream in = new BufferedInputStream(conn.getInputStream());
			
			try{
				String inputLine;
				byte[] buf = new byte[4096];
				int bytesRead = 0;
				while (bytesRead >= 0) {
					inputLine = new String(buf, 0, bytesRead, "ISO-8859-1");
					html.append(inputLine);
					bytesRead = in.read(buf);
					inputLine = null;
				}
				buf = null;
			}finally{
				in.close();
				conn = null;
				url = null;
			}
			result = new String(html.toString().trim().getBytes("ISO-8859-1"), "gb2312").toLowerCase();
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			html = null;			
		}
		return result;
	}
}
