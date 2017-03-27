package com.hcy.ssm.pojo;

import org.springframework.stereotype.Repository;

@Repository
public class Person {

	
	private String name;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void say () {
		System.out.println(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
