package com.javaex.ex13;

public class Ex01 {

	public static void main(String[] args) {
		
		String str = new String("안녕하세요");
		
		str = "hi";
		
		try {
			System.out.println(str.toString());	
		} catch (NullPointerException e) {
			System.out.println("주소값이 없습니다");
		}
		
	}

}
