package com.n2sbasiscs;

public class StaticSample {
	
	static int x = 5;

	//For accessing variables inside static methods, the variables should also be static.
	public static void main(String[] args) {
		System.out.println("1. Inside Main Method");
		Sample.displayTwo();
		displayOne();
		System.out.println("2. Still Inside Main Method");
		
	}
	
	public static void displayOne() {
		System.out.println("3. Inside Display One");
		x = 10;
	}
	
	static class Sample{
		public static void displayTwo() {
			System.out.println("4. Inside Display Two");
			x = 15;
		}
	}
	
	static {
		System.out.println("5. Inside Static Block");
	}
}