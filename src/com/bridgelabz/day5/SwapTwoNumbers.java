package com.bridgelabz.day5;

import java.util.*;
public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number1: ");
		int a = scan.nextInt();
		System.out.print("Enter Number2: ");
		int b = scan.nextInt();
		int x=0;
		System.out.println();
		System.out.println("Numbers Before Swapping: "+a+" & "+b);
		x=a;
		a=b;
		b=x;
		System.out.println();
		System.out.println("Numbers After Swapping: "+a+" & "+b);

	}

}
