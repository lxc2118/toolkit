package hcy.util.kit.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import hcy.util.kit.pojo.Person;

public class ProTest {

	public static void main(String[] args) {
//		List<Person> list = new ArrayList<>();
//		Person p1= new Person();
//		p1.setAge(1);
//		Person p2 = new Person();
//		p2.setAge(7);
//		Person p3 = new Person();
//		p3.setAge(6);
//		list.add(p1);
//		list.add(p2);
//		list.add(p3);
//		
//		Collections.sort(list,new Comparator<Person>() {
//			@Override
//			public int compare(Person p1, Person p2) {
//				if(p1.getAge()>p2.getAge())
//					return 1;
//			return -1;
//			}
//		});
//		for(Person p :list) {
//			System.out.println(p.getAge());
//		}
		
		List<Item> list = new ArrayList<>();
		list.add(new Item(1));
		list.add(new Item(2));
		Integer num = list.stream().map(item->item.getNum()).reduce(Integer::sum).get();
		System.out.println(num);
	}
	
	public static class Item {
		private int num;
		public Item(Integer num) {
			this.num = num;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		
	}
	
	public class A {
		void run (){
			System.out.println("A");
		}

		public void test() {
			// TODO Auto-generated method stub
		}
	}
	
	public class C extends A{
		public void test() {
			System.out.println("C");
		}
	}
}

