package com.javaex.ex09;

public class Person {
	
	protected String name;
	protected int age;
	
	public Person(){
		System.out.println("Person()");
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(2)");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void showInfo() {
		System.out.println("이름: " + name + "\n나이: " + age);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
}
