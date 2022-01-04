package com.myproject.controller;

public class Kit {

	public void doSomething(Pen p) {
		p.write();
		p.read();
	}
	public void doSomething(Pencil pc) {
		pc.write();
		pc.read();
	}
	public void doSomething(Writer w) {
		w.write();
		
	}
	public void doSomething(Reads r) {
		r.read();
		
	}
	public void doSomething(TextColor tc) {
		tc.color();
		tc.colorless();
	}
}
