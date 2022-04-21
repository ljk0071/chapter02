package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.setName("nikon");
		camera.setPrice(400000);
		Goods computer = new Goods();
		computer.setName("LG 그램");
		computer.setPrice(900000);
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		
//		System.out.println("상품가격 : " + cup.getName() +", 가격: " + cup.getprice()+"\n");
//		System.out.println("상품가격 : " + computer.getName() +", 가격: " + computer.getprice());
//		System.out.println("상품가격 : " + camera.getName() +", 가격: " + camera.getprice());
		
		camera.showInfo();
		computer.showInfo();
		cup.showInfo();
		
	}

}
