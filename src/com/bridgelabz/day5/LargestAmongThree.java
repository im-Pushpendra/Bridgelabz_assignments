package com.bridgelabz.day5;

import java.util.*;
public class LargestAmongThree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number1: ");
		int a = scan.nextInt();
		System.out.print("Enter Number2: ");
		int b = scan.nextInt();
		System.out.print("Enter Number3: ");
		int c = scan.nextInt();
		if(a>b&&a>c)
			System.out.print(a+" is Largest among Three Numbers");
		else if(b>c)
			System.out.print(b+" is Largest among Three Numbers");
		else
			System.out.print(c+" is Largest among Three Numbers");

	}

}
