package com.myproject.controller;

public class MyTest {

	public static void main(String[] args) {

		for (int m = 4; m >= 1; m--) {
			
			for (int n = 1; n < m; n++) 
				System.out.print(" ");	
		
			for (int p = 4; p >= m; p--)
				System.out.print("* ");
			
			System.out.println();
		}
		
		for (int m = 3; m >= 1; m--) {
			
			for (int p = 3; p >= m; p--)
				System.out.print(" ");	
			
			for (int n = m; n >= 1; n--) 
				System.out.print("* ");	
		
			
			System.out.println();
		
			
	}

}
}
