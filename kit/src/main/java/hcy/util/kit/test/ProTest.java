package hcy.util.kit.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class ProTest {

	public static void main(String[] args) {
		String today = LocalDate.now().toString();
		SimpleDateFormat format = new SimpleDateFormat();
		format.applyPattern("yyyy-MM-dd");
		try {
			Date haha = format.parse(today);
			System.out.println(haha);
//			System.out.println(new Date(today));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
