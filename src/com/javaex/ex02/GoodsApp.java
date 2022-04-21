package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.name = "니콘";
		camera.price = 400000;
		Goods laptop = new Goods();
		laptop.name = "LG 그램";
		laptop.price = 900000;
		Goods cup = new Goods();
		cup.name = "머그 컵";
		cup.price = 2000;
		
		String[] goodsName = new String[] { camera.name,laptop.name,cup.name };
		int[] goodsPrice = new int[] { 400000, 900000, 2000 };
		
		for (int i=0;i<goodsName.length;i++) {
			System.out.println("상품 이름: " + goodsName[i] + "\n가격: " + goodsPrice[i]);
		}
	}

}
