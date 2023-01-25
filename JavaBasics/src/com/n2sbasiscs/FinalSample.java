package com.n2sbasiscs;

final class SuperClass extends FinalSample{
	public final void superdisplay() {
		System.out.println("Inside Super Display Class");
	}
}

public class FinalSample {

	static int y;
	static String s;
	static final int z = 10;
	//static public final x;
	
	public static void main(String[] args) {
		
		FinalSample fs = new FinalSample();
		fs.superdisplay();
	}
	
	public void superdisplay() {
		System.out.println("Inside Super Display Class Again");
	}

}
