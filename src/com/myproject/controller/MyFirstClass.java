package com.myproject.controller;

import java.util.ArrayList;
import java.util.Collection;

public class MyFirstClass extends ArrayList implements Collection {

	public static void main(String args[]) {
		
		int i[]= {1,2,3,4,5,6,7,8};
		
		Thread t = new MyThread();
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		Thread t3 = new MyThread();
		t.start();
	}
	Collection cl = new ArrayList(); 
	public static void SampleNum() {
		System.out.println("num");
		
		int i,j;
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	
	
	static void SampleStar() {

		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= a; b++) {
				
				if (a % 2 == 0) {
					break;
				}
				else
					System.out.print("* ");
			}
			System.out.println("");
		}

	}

	void Sample() {

		int num1 = 12321;
		int rev = 0, num = num1;

		while (num != 0) {

			int rem = num % 10;
			rev = rev * 10 + rem;

			num = num / 10;
		}
		if (rev == num1)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}
	
	static void pyramid() {

		for (int m = 4; m <= 1; m--) {
			
			for (int n = 1; n < m; n++) {
			
				System.out.print(" ");
			}
				for (int p = 4; p >= m; p--) {
					System.out.print("* ");
				}
				System.out.println();
		}
	}
}

