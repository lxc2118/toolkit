package hcy.util.kit.pojo;

import hcy.util.kit.office.XlsCell;
import hcy.util.kit.office.XlsSheet;

/**
 * 测试用pojo
 * @author lxc
 *
 */
@XlsSheet(name="xls中底部sheet名称")
public class Person {

	@XlsCell(name="姓名")
	private String name;

	
	private Integer age;
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
