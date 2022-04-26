package com.javaex.ex10;

public class Draw {

	public static void main(String[] args) {
		
		Ractangle[] rac = new Ractangle[2];
		Triangle[] tri = new Triangle[2];
		Circle[] cir = new Circle[2];
		
		rac[0] = new Ractangle("빨강", "검정", 4, 4);
		rac[1] = new Ractangle("주황", "검정", 5, 5);
		tri[0] = new Triangle("빨강", "검정", 4, 4);
		tri[1] = new Triangle("보라", "검정", 10, 10);
		cir[0] = new Circle("보라", "빨강", 3);
		cir[1] = new Circle("보라", "검정", 3);
		for(int i=0;i<rac.length;i++) {
			rac[i].draw();
			if( i == rac.length-1 ) {
			for(int j=0;j<rac.length;j++) {
				tri[j].draw();
				if( j == rac.length-1 )
					for(int k=0;k<rac.length;k++) {
						cir[k].draw();
					}
				}
			}
		}
	}
}
