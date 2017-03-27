package com.fastwebx.common.util;

import java.util.ArrayList;
import java.util.Iterator;

import junit.framework.TestCase;

/**
 * @author mj
 */
public class NextUtilTest extends TestCase {
	public void testNext(){
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list.iterator().next());
		System.out.println(list.iterator().next());
		System.out.println("==============");
		Iterator i = list.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
	}
}
