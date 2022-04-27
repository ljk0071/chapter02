package com.javaex.ex09;

public class PointerApp {

	public static void main(String[] args) {
		
		Pointer p = new Pointer(4,4);
		
		ColorPointer cp1 = new ColorPointer("red");
		ColorPointer cp2 = new ColorPointer(10, 10, "red");
		
		System.out.println(p + "" + cp1 + "" + cp2); 
		
		
	}

}
