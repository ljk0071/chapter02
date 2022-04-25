package com.javaex.ex06;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
//		Goods camera = new Goods("nikon", 40000);
//		Goods laptop = new Goods("lg gram", 900000);
//		Goods cup = new Goods("mugcup", 2000);
//		
//		System.out.println(camera.toString());
//		System.out.println(laptop.toString());
//		System.out.println(cup.toString());
		
		Goods[] goods = new Goods[3];
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<goods.length;i++) {
			goods[i] = new Goods();
			goods[i].setName(sc.next());
			goods[i].setPrice(sc.nextInt());
			goods[i].showInfo();
		}
		sc.close();
		
	}

}
