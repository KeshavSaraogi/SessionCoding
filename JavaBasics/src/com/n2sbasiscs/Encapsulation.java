package com.n2sbasiscs;

class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
		s.display1();
		
		//Innersample is = new Innersample();
		System.out.println(s.x);
		//System.out.println(s.y);
	}

}

class Sample{
	
	public int x = 5;
	private int y = 10;
	
	InnerSample is = new InnerSample();
	
	public void display1() {
		System.out.println("Display 1");
		is.display2();
		display3();
	}
	
	private void display3() {
		System.out.println("Display 2");
	}
	
	private class InnerSample {
		public void display2() {
			System.out.println("Display 3");
		}
	}	
}
