package hcy.util.kit.http;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

import hcy.util.kit.pojo.Person;

public class Cookies {
	
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		Person p1= new Person();
		p1.setAge(1);
		Person p2 = new Person();
		p2.setAge(7);
		Person p3 = new Person();
		p3.setAge(6);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
//		Collector
		list.sort(new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				if(p1.getAge()>p2.getAge())
					return -1;
				return 1;
			}
		});
		for(Person p :list) {
			System.out.println(p.getAge());
		}
	}
}
