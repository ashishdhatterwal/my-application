package com.myproject.controller;

public interface TextColor {

	void color();
	default void colorless() {
		System.out.println("TextColor colorless");
	}
}
