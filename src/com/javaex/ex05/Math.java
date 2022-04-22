package com.javaex.ex05;

public class Math {
	
	private double a;
	private double b;
	private double result;
	
	
	public double plus(double a, double b) {
		this.a = a;
		this.b = b;
		this.result = this.a + this.b;
		return result;
	}
}
