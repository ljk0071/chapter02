package com.javaex.ex04;

import java.util.Scanner;

public class PointApp {

	public static void main(String[] args) {
		Point xy = new Point();
		Scanner sc = new Scanner(System.in);
		int x,y;
		x=y=0;
		while(true) {
			System.out.print("(종료하시려면 0을 입력하세요)\nX좌표를 입력 해 주세요: ");
			x=sc.nextInt();
			System.out.print("(종료하시려면 0을 입력하세요)\nY좌표를 입력 해 주세요: ");
			y=sc.nextInt();
			if (x == 0 || y == 0) {
				break;
			}else {
				xy.setX(x);
				xy.setY(y);
				xy.draw();
			}
		}
		sc.close();
	}

}
