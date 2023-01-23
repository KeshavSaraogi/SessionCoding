package com.n2sbasiscs;

public class MethodOverriding extends Super{

	public static void main(String[] args) {
		MethodOverriding mo = new MethodOverriding();
		mo.msg();
		
	}
	
	public void msg() {
		System.out.println("MO");
		super.msg();
	}
}

class Super {
	public void msg() {
		System.out.println("Super");
	}
}