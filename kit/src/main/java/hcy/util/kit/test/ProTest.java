package hcy.util.kit.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class ProTest {

	public static void main(String[] args) {
		if(new ArrayList<Integer>(){{
		    add(1);
		}}.stream().map(a->{System.out.print("a"); return false;}).equals(null)){
			System.out.println("a");
		} else {
			System.out.println("b");
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
