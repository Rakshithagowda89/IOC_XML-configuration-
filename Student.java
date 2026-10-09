package com.demo;

public class Student {
	private int id;
	private String name;
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Student() {
		super();
		System.out.println("object is created");
	}
	
	public void Display() {
		System.out.println("ID  ="+id);
		System.out.println("Name =" +name);
	}
 
}
