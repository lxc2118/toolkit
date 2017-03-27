package com.fastwebx.common.util;

import java.util.List;

import junit.framework.TestCase;

/**
 * @author mj
 */
public class NumUtilTest extends TestCase {
	public void testParse2Ints(){
		String str = "1,2,3|4,6,7|909";
		List<int[]> list = NumUtil.parse2Ints(str);
		for(int[] nums :list){
			System.out.println("nums.length="+nums.length);
			for(int num:nums){
				System.out.print(num);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
