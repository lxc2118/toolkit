package com.fastwebx.common.container;

import java.util.Random;

import junit.framework.TestCase;

/**
 * @author mj
 */
public class TopContainerTest extends TestCase {
	public void test1(){
		TopContainer<Integer> i = new TopContainer<Integer>(3);
		i.add(100);
		i.add(10);
		i.add(31);
		i.add(5);
		for(Integer n:i){
			System.out.println(n);
		}
	}
	
	public void test2(){
		long d = System.currentTimeMillis();
		int max = 20000000;
		TopContainer<Integer> tc = new TopContainer<Integer>(100);
		for(int i=0;i<max;i++){
			tc.add(new Random().nextInt(max));
		}
		System.out.println("===date="+(System.currentTimeMillis()-d));
		for(Integer i:tc){
			System.out.println(i);
		}
	}
}
