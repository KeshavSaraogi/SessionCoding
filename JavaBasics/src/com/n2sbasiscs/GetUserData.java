package com.n2sbasiscs;

import java.util.Scanner;

public class GetUserData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String name = sc.next();
		System.out.print("Ener Your Age: ");
		int age = sc.nextInt();
		
		System.out.println("Your Name is " + name + " and your age is " + age);
	}

}
