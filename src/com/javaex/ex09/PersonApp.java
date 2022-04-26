package com.javaex.ex09;

public class PersonApp {

	public static void main(String[] args) {
		Person p01 = new Person("이준규", 26);
		
		Student s01 = new Student("상문고등학교");
		Student s02 = new Student();
		Student s03 = new Student("이준규", 26, "상문고등학교");
		
		System.out.println(s03);
	}

}
