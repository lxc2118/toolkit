package com.fastwebx.common.perk.imp;

import junit.framework.TestCase;

public class MaxPerkTest extends TestCase {
	public void testPerk(){
		MaxPerk<Integer> max= new MaxPerk<Integer>(){

			@Override
			protected int compare(Integer t1, Integer t2) {
				return t1-t2;
			}
			
		};
		assertEquals(new Integer(10), max.perk(8,9,10,5,4,2));
		
		
	}
	public void testMinPerk(){
		MinPerk<Integer> min= new MinPerk<Integer>(){

			@Override
			protected int compare(Integer t1, Integer t2) {
				return t1-t2;
			}
			
		};
		assertEquals(new Integer(2), min.perk(8,9,10,5,4,2));
		
		
	}
}
