package com.javaex.ex12;

public class Triangle extends Shape implements Drawable {
	
	private int width, height;
	
	public Triangle() {
	}
	public Triangle(String fillColor, String lineColor, int width, int height) {
		super.fillColor = fillColor;
		super.lineColor = lineColor;
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Triangle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", width=" + width + ", height="
				+ height + "]";
	}
	public void draw() {
		System.out.println("면색: "+fillColor+", 선색: "+lineColor+", 가로: "+width+", 세로: "+height+" 삼각형을 그렸습니다.");
	}
	public double area() {
		return (width*height)/(double)2;
	}
}
