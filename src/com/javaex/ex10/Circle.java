package com.javaex.ex10;

public class Circle extends Rectangle{
	
	private int radius;
	
	public Circle() {
	}
	public Circle(String fillColor , String lineColor, int radius) {
		super.fillColor = fillColor;
		super.lineColor = lineColor;
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getFillColor()=" + getFillColor() + ", getLineColor()=" + getLineColor()
				+ "]";
	}
	public void draw() {
		System.out.println("면색: "+fillColor +", 선색: "+lineColor +", 반지름: "+radius+" 원을 그렸습니다.");
	} 
}
