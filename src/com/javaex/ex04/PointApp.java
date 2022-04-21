package com.javaex.ex04;

import java.util.Scanner;

public class PointApp {

	public static void main(String[] args) {
		Point xy = new Point();
		Scanner sc = new Scanner(System.in);
		int x,y;
		x=y=0;
		while(true) {
			x=sc.nextInt();
			y=sc.nextInt();
			xy.setX(x);
			xy.setY(y);
			xy.draw();
			if (sc.nextInt() == 0) {
				break;
			}
		}
		sc.close();
	}

}
