package hcy.util.kit.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProTest {

	public static void main(String[] args) {
//		if(new ArrayList<Integer>(){{
//		    add(1);
//		}}.stream().map(a->{System.out.print("a"); return false;}).equals(null)){
//			System.out.println("a");
//		} else {
//			System.out.println("b");
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

