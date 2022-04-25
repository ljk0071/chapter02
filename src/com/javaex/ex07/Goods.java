package com.javaex.ex07;

public class Goods {
	
	private String name;
	private int price;
	private static int count;
	
	public Goods() {
		count += 1;
	}
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		count += 1;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int countNum) {
		count = countNum;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name + "\n가겨: " + price + "\n횟수: " + count);
	}
}

