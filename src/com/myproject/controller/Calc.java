package com.myproject.controller;

public class Calc {

	public int sum(int x,int y) {
		return x+y;
	}

	public int diff(int x,int y) {
		return x-y;
	}
	
	public int multi(int x,int y) {
		return x*y;
	}
	
	public double division(double x,double y) {
		return x/y;
	}

}

class Calculator {

	public static void main(String[] args) {

		Calc obj = new Calc();

		int sum1 = obj.sum(16,12);

		System.out.println(obj.sum(16,12));
		System.out.println(obj.diff(16, 12));
		System.out.println(obj.multi(16,12));
		System.out.println(obj.division(16,12));
	}
}