package com.javaex.ex09;

public class Pointer {
	
	protected int x,y;
	
	public Pointer() {
		
	}
	public Pointer(int x,int y) {
		this.x = x;
		this.y = y;
		System.out.println("1");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void showInfo() {
		System.out.println("x: " + x + "\ny " + y);
	}
}
