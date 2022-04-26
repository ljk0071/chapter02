package com.javaex.ex10;

public class Triangle extends Ractangle{
	
	public Triangle() {
		
	}
	public Triangle(String fillColor, String lineColor, int width, int height) {
		super.fillColor = fillColor;
		super.lineColor = lineColor;
		super.width = width;
		super.height = height;
	}
	@Override
	public String toString() {
		return "Triangle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", width=" + width + ", height="
				+ height + "]";
	}
	public void draw() {
		System.out.println("면색: "+fillColor+", 선색: "+lineColor+", 가로: "+width+", 세로: "+height+" 삼각형을 그렸습니다.");
	}
}
