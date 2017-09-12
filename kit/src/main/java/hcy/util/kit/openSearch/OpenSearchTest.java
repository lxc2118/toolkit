package hcy.util.kit.openSearch;

import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.aliyun.opensearch.CloudsearchClient;
import com.aliyun.opensearch.CloudsearchSearch;
import com.aliyun.opensearch.object.KeyTypeEnum;

public class OpenSearchTest {

	private static String accesskey= "Bs1FfsAgQhrCSNSy";
	private static String secret = "p3QEuolEQN92H15bRbGH9KT7P59V2W";
//	private static String appName =  "您要创建的应用名称";
	private static String host = "http://opensearch-cn-hangzhou.aliyuncs.com";
	private static Map<String, Object> opts = new HashMap<>();
	// 这里的host需要根据访问应用详情页中提供的的API入口来确定

	
	public static void main(String[] args) throws UnknownHostException {
//		CloudsearchClient client = new CloudsearchClient(accesskey, secret , host, opts, KeyTypeEnum.ALIYUN);
//		CloudsearchSearch search = new CloudsearchSearch(client);
//		// 添加指定搜索的应用：
//		search.addIndex("您的应用名称");
//		// 指定搜索的关键词，这里要指定在哪个索引上搜索，如果不指定的话默认在使用“default”索引（索引字段名称是您在您的数据结构中的“索引到”字段。）
//		search.setQueryString("'词典'");
//		search.setQueryString("default:'词典'");
//		search.setQueryString("index_name:'词典'");
//		// 指定搜索返回的格式。
//		search.setFormat("json");
//		// 设定过滤条件
//		search.addFilter("price>10");
//		// 设定排序方式 + 表示正序 - 表示降序
//		search.addSort("price", "+");
		// 返回搜索结果
//		System.out.println(search.search());
		Set<String> set = new HashSet<>(4);
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("A");
		set.add("D");
		set.add("E");
		set.add("F");
		Iterator<String> ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
}
