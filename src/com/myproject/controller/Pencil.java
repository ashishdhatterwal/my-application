package com.myproject.controller;

public class Pencil extends Writer implements Reads, TextColor{

	public void write() {
		System.out.println("I'm a Pencil.");
	}
	public void read() {
		System.out.println("Pencil reads.");
	}
	public void color() {
		System.out.println("Pencil color.");
	}
}
