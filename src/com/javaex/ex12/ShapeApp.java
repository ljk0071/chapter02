package com.javaex.ex12;

public class ShapeApp {

	public static void main(String[] args) {
		
		Point p01 = new Point(3,5);
		p01.draw();
		System.out.println(p01.getX());
		
		Drawable p02 = new Point(100, 100);
		p02.draw();
		System.out.println(((Point)p02).getX());
		
		Drawable[] dArray = new Drawable[4];
		
		dArray[0] = new Rectangle("red", "white", 4, 4);
		dArray[1] = new Circle("red", "white", 4);
		dArray[2] = new Triangle("red", "white", 4, 4);
		dArray[3] = new Point(4,6);
		
		for(int i=0;i<dArray.length;i++) {
			dArray[i].draw();
		}
		
		for(int i=0;i<dArray.length;i++) {
			if (dArray[i] instanceof Shape) {
				System.out.println(((Shape)dArray[i]).area());
			}
		}
		
				
	}

}
