package hcy.util.kit;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import hcy.util.kit.http.HttpReq;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	public AppTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		if(new ArrayList<Integer>(){{
		    add(1);
		}}.stream().filter(a->{System.out.println(a); return false;}).equals(null)){
			System.out.println("a");
		} else {
			System.out.println("b");
		}
		return new TestSuite(AppTest.class);
	}

	public void testApp() {
		// System.out.println(UUID.randomUUID().toString().length());
//		nickname:郁闷些
//		passwd:Robert
//		seccode:agxv
//		Map<String, String> map = new HashMap<>();
//		map.put("nickname", "郁闷些");
//		map.put("passwd", "Robert");
//		String html = new HttpReq("http://passport.bookuu.com/login.php").put(map).setCharset("utf-8").execute();
//		System.out.println(html);
		
//        String badStr = "'|and|exec|execute|insert|select|delete|update|count|drop|*|%|chr|mid|master|truncate|" +
//                "char|declare|sitename|net user|xp_cmdshell|;|or|-|+|,|like'|and|exec|execute|insert|create|drop|" +
//                "table|from|grant|use|group_concat|column_name|" +
//                "information_schema.columns|table_schema|union|where|select|delete|update|order|by|count|*|" +
//                "chr|mid|master|truncate|char|declare|or|;|-|--|+|,|like|//|/|%|#";//过滤掉的sql关键字，可以手动添加
//        String[] badStrs = badStr.split("\\|");
//        for (String str:badStrs) {
//        	System.out.println(str);
//        }
		
        String filterString = "'|and|exec|union|create|insert|select|delete|update|count|*|%|chr|mid|master|truncate|char|declare|xp_|or|--|+|\"|;|(|,";
        String input = "and 1=1 哈哈哈";
        String[] badStrings = filterString.split("\\|");
        for (String str:badStrings) {
            if (input!=null) {
                String temp = input.toLowerCase();
                if(temp.indexOf(str) >= 0)
                    throw new RuntimeException("非法字符");
            }
            if (input!=null) {
                String temp = input.toLowerCase();
                if(temp.indexOf(str) >= 0)
                    throw new RuntimeException("非法字符");
            }
        }
	}
}
