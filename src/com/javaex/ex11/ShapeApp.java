package com.javaex.ex11;

public class ShapeApp {

	public static void main(String[] args) {
		
//		Circle[] cir = new Circle[2];
//		Rectangle[] rec = new Rectangle[2];
//		Triangle[] tri = new Triangle[2];
//		
//		tri[0] = new Triangle("red", "white", 4, 4);
//		tri[1] = new Triangle("red", "black", 4, 4);
//		rec[0] = new Rectangle("red", "white", 6, 6);
//		rec[1] = new Rectangle("black", "white", 6, 9);
//		cir[0] = new Circle("red", "white", 6);
//		cir[1] = new Circle("black", "white", 60);
//		
//		for(int i=0;i<cir.length;i++) {
//			tri[i].draw();
//			if ( i == cir.length-1 ) {
//				for(int j=0;j<cir.length;j++) {
//					cir[j].draw();
//					if ( j == cir.length-1 ) {
//						for(int k=0;k<cir.length;k++) {
//							rec[k].draw();
//						}
//					}
//				}
//			}
//		}
		
//		Shape s = new Shape("red", "white");
//		
//		Rectangle r = new Rectangle("white", "red", 4, 4);
////		System.out.println(r.getWidth()); // 자식의 메소드 사용 가능
//		
//		
//		Shape sr = new Rectangle("black", "white", 3, 3);
//		System.out.println(sr.getWidth()); // 자식의 메소드 사용 불가능
		
//		shape 배멸에 모든 도형을 담고 관리
		
		Shape[] sArray = new Shape[6];
		
		sArray[0] = new Rectangle("white", "red", 5, 5);
//		Rectangle r = new Rectangle("white", "red", 5, 5);
//		sArray[0] = r;
		sArray[1] = new Rectangle("white", "red", 7, 9);
		sArray[2] = new Triangle("white", "red", 5, 3);
		sArray[3] = new Triangle("white", "red", 5, 12);
		sArray[4] = new Circle("white", "red", 8);
		sArray[5] = new Circle("white", "red", 5);
		
		
		((Rectangle)sArray[1]).getWidth();
		
		
		for(int i=0;i<sArray.length;i++) {
			sArray[i].draw();
			System.out.println("넓이: "+sArray[i].area());
		}
		
		
	}
}
