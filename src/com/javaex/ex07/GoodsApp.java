package com.javaex.ex07;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods[] goods = new Goods[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<goods.length;i++) {
			goods[i] = new Goods();
			System.out.print("이름: ");
			goods[i].setName(sc.next());
			System.out.print("가격: ");
			goods[i].setPrice(sc.nextInt());
			goods[i].showInfo();
		}
		sc.close();
		
	}

}
