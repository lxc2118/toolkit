package com.hcy.ssm;

public class People {
	String name;
	public People() {
		System.out.println("我是父类构造");
	}
	public People(String name){
		System.out.println(2);
		this.name=name;
	}

}

