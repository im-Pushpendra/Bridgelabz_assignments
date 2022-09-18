package com.bridgelabz.day2;

import java.util.*;
public class Displayunit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int x = scan.nextInt();
		if(x == 1)
			System.out.println("Unit");
		else if(x == 10)
			System.out.println("Ten");
		else if(x == 100)
			System.out.println("Hundred");
		else if(x == 1000)
			System.out.println("Thousand");
		else if(x == 10000)
			System.out.println("Ten Thousands");
		else if(x == 100000)
			System.out.println("One Lakh");
		else
			System.out.println("Invalid Num");

	}

}
