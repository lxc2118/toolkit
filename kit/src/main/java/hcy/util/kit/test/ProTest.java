package hcy.util.kit.test;

import java.util.ArrayList;
import java.util.List;

import util.ListUtil;



public class ProTest {

	public static void main(String[] args) {
		List<Long> list = new ArrayList<>();
		list.add(12l);
		list.add(34l);
		list.add(45l);
		System.out.println(ListUtil.toString(list));
	}
}
