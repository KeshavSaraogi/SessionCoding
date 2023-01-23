package com.n2sbasiscs;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mo = new MethodOverloading();
		System.out.println(mo.add(2));
		System.out.println(mo.add(2,3));
		System.out.println(mo.add(2,3,4));
		System.out.println(mo.add(2,3,4,5));
	}
	
	public int add(int x, int y) {
		return x + y;
	}
	
	public int add(int x, int y, int z) {
		return x + y + z;
	}
	
	public int add(int x, int y, int z, int w) {
		return w + x + y + z;
	}
	
	public int add(int x) {
		return x + x;
	}

}
