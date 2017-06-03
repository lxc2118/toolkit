package com.hcy.ssm;

public class Child extends People{
	People father;
	public Child(String name){
		System.out.println(3);
		this.name=name;
		father = new People(name+":F");
	}
	
	public Child(){
		System.out.println(4);
	}
}