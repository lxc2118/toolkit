package hcy.util.kit.crawler;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.http.client.ClientProtocolException;
import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import hcy.util.kit.http.HttpReq;

/**
 * Hello world!
 *
 */
public class App {

	public static final String domain = "http://www.mmgg.com";

	// private static Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
		String fetchUrl = domain + "/dianpu/?p={p}";

		// logger.info("开始抓取页面：" + currentUrl);

		try {
			int page = 1;
			while (page < 300) {
				String currentUrl = fetchUrl.replace("{p}", (page++) + "");
				System.out.println("---------" + currentUrl);
				for(String shopUrl: findShopUrlList(currentUrl)){
					for(String itemUrl: findItemUrlList(shopUrl)){
						System.out.println(itemUrl);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<String> findShopUrlList(String url) {
		try {
			String html = new HttpReq(url).execute();
			Document doc = Jsoup.parse(html);
			List<Element> shopElementList = doc.select("div.item_list");
			List<String> urlList = shopElementList.stream().map(e -> e.select("a[href]").first().attr("href"))
					.collect(Collectors.toList());
			return urlList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static List<String> findItemUrlList(String url) {
		try {
			String html = new HttpReq(url).execute();
			Document doc = Jsoup.parse(html);
//			List<Element> itemElementList = doc.select("ul.goods-list").first().select("li.r > a");
			List<String> urlList = doc.select("ul.goods-list").first().select("li")
					.stream().map(el->el.select("a[href]").first()).collect(Collectors.toList())
					.stream().map(el->el.attr("href")).collect(Collectors.toList());
			return urlList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void save(String url){
		try {
			String html = new HttpReq(url).execute();
			Document doc = Jsoup.parse(html);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
