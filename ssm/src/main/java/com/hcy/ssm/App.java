package com.hcy.ssm;

import java.io.StringWriter;
import java.util.List;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcy.ssm.codeCreater.IbatisCode;
import com.hcy.ssm.codeCreater.JavaCode;
import com.hcy.ssm.common.S;
import com.hcy.ssm.common.SpringContext;
import com.hcy.ssm.context.Context;
import com.hcy.ssm.dao.TableDao;
import com.hcy.ssm.pojo.Person;
import com.hcy.ssm.pojo.Table;
import com.hcy.ssm.util.NameUtil;

/**
 * Hello world!
 *
 */
public class App extends TestBase{
	
	public void test() {
		List<Table> list = S.get(TableDao.class).getTables();
		for(Table table:list) {
			System.out.println(table.getName());
		}
	}
	
	public void testVelocity() {
		Properties p = new Properties();
		p.setProperty("file.resource.loader.class","org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
		Velocity.init(p);
		Template template = Velocity.getTemplate("/templet/hello.vm");
		VelocityContext context = new VelocityContext();
		context.put("name", "Velocity");
		context.put("project", "Jakarta");
		StringWriter writer = new StringWriter();
		template.merge(context, writer);
		System.out.println(writer);
	}
	
	public void testMybatics() {
		Properties p = new Properties();
		p.setProperty("file.resource.loader.class","org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
		Velocity.init(p);
		Template template = Velocity.getTemplate("/templet/mybatis.vm");
		VelocityContext context = new VelocityContext();
		List<Table> list = S.get(TableDao.class).getTables();
		context.put("nameUtil", NameUtil.get());
		context.put("table", list.get(0));
		context.put("pojoPkg", Context.getPkgName());
		StringWriter writer = new StringWriter();
		template.merge(context, writer);
		System.out.println(writer);
	}
	
	public void testProcess() {
		 S.get(IbatisCode.class).process();
		 ((JavaCode)S.get("pojo")).process();
		 new CopySrc().execute();
	}
	
	public static void main(String[] args) {
		SpringContext.setContext(new ClassPathXmlApplicationContext("beans.xml"));
//		S.get(TableDao.class).getTables();
		Person person = S.get(Person.class);
		person.say();
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		Person person = (Person) context.getBean("personBean");
//		person.say();
	}
}
