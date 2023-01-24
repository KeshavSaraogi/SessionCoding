package com.n2sbasiscs;

public class InterfaceSample implements InterfaceOne, InterfaceTwo{

	public static void main(String[] args) {
		InterfaceSample is = new InterfaceSample();
		System.out.println(is.add(ifcx, ifcy));
		System.out.println(is.sub(ifcx, ifcy));
		
		InterfaceOne.testTwo();
		is.testOne();
		
		//Two ways of implementing an interface
		
		InterfaceTwo ifctwo = new InterfaceTwo() {
			
			@Override
			public int mult(int x, int y) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int sub(int x, int y) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x - y;
	}

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	@Override
	public int mult(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

}
