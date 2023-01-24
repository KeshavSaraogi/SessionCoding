package com.n2sbasiscs;

public interface InterfaceOne {
	
	public static final int ifcx = 5;
	public abstract int add(int x, int y); 
	
	// Different ways of making methods in interface
	
	public default void testOne() {}
	public static void testTwo() {}
	//private void testThree() {}

}
