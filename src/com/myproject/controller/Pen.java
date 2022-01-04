package com.myproject.controller;

public class Pen extends Writer implements Reads,TextColor{

	public void write() {
		System.out.println("I'm a Pen.");
	}

	public void read() {
		System.out.println("Pen reads.");
	}
	public void color() {
		System.out.println("Pen color.");
	}
	
}
