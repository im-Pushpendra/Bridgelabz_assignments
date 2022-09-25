package com.bridgelabz.day5;

import java.util.*;
public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int a = scan.nextInt();
		System.out.println();
		if(a%2==0)
			System.out.print(a+" is Even Number");
		else
			System.out.print(a+" is Odd Number");

	}

}
