package com.myproject.controller;

public class Test2 {

	public static void main(String[] args) {

		for (int a = 1; a <= 4; a++) {

			for (int b = 1; b < a; b++) {
				System.out.print(" ");
			}

			for (int c = 4; c >= a; c--) {
				System.out.print("*");

			}
			System.out.println();
		}

	}
}
