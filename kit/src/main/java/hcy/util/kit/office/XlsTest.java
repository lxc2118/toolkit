package hcy.util.kit.office;

import java.util.ArrayList;
import java.util.List;

import hcy.util.kit.pojo.Person;
import junit.framework.TestCase;

public abstract class XlsTest extends TestCase{
	
	public void test() {
		List<Person> list = new ArrayList<Person>();
		Person p1 = new Person();
		p1.setName("张三");
		Person p2 = new Person();
		p2.setName("李四");
		list.add(p1);
		list.add(p2);
		
		new Xls(list).create2File("D:\\1.xls");
		
		// 导出byte[]
//		new Xls(list).create2Byte();
	}
}
