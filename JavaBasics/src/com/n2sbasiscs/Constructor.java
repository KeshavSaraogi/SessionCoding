package com.n2sbasiscs;

public class Constructor {

	public static void main(String[] args) {
		Constructor ct = new Constructor(10, 20);
		ChildConstructor cct = new ChildConstructor();
	}
	
	Constructor(){
		System.out.println("Default Constructor");
	}
	
	Constructor(int x){
		System.out.println("Default Constructor " + x);
	}
	
	Constructor(int x, int y){
		this();
		System.out.println("Default Constructor " + x + " " + y);
	}
}

//We cannot override a constructor, simply because the constructor is tightly coupled with the class members. 

class ChildConstructor extends Constructor{
	
	ChildConstructor(){
		super();
		System.out.println("Child Constructor");
	}
	ChildConstructor(int x){
		System.out.println("Child Constructor " + x);
	}
}