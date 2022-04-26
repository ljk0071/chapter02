package com.javaex.ex09;

public class ColorPointer extends Pointer {
	
	String color;
	
	public ColorPointer() {
	}
	public ColorPointer(int x, int y, String color) {
		super(x, y);
		this.color = color;
		System.out.println("2");
	}
	public ColorPointer(String color) {
		this.color = color;
		System.out.println("3");
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void showInfo() {
		System.out.println("x: " + super.getX() + "\ny: " + super.getY() + "\ncolor: " + color);
	}
}
