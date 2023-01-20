package com.n2sbasiscs;

public class SampleOne {

	public static void main(String[] args) {
		System.out.println("Hello World One");

	}
	
	public int add(int x, int y) {
		return x + y;
	}
	
	public int subtract(int x, int y) {
		return x - y;
	}
	
	public int multiply(int x, int y) {
		return x * y;
	}
	
	public int divide(int x, int y) {
		if (x == 0 || y == 0) {
			return -1;
		}
		else {
			return x / y;
		}
	}

}
