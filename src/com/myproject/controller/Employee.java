package com.myproject.controller;

public class Employee{
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.sound("XYZ");
		
		Dog dog = new Dog();
		dog.sound("ABC");
		
		Animal animalDog = new Dog();
		animalDog.sound("QWERTY");
		
		int x = 5;
		Integer i = x;
		
		Number i2 =10.5;
		int as = (int) i2;
		
		
	}
	
	private int id;
	
	private String name = "Ashish";

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		String name  = "Pragya";
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	void m() {
		System.out.println("hello m");
	}

	void n() {
		System.out.println("hello n");
		// m();//same as this.m()
		m();
	}


}
