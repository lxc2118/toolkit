package hcy.util.kit.crawler;

import hcy.util.kit.http.HttpReq;

/**
 * 百度云爬虫 TODO
 * @author lxc
 *
 */
public class BaiduYun {

	public static String url = "http://pan.baidu.com/share/link?shareid=1260640415&uk=3449908808";

	public static void main(String[] args) {
		String html = new HttpReq("http://plus.go2.cn/new_style/1")
				.setProxy()
				.execute();
		System.out.println(html);
	}
}
