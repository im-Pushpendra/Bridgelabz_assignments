package com.bridgelabz.day6;

import java.util.*;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of Fibonacci Series: ");
		int n = scan.nextInt();
		int a = 0,b = 1,c = 0;
		System.out.println(a);
		System.out.println("1");
		for(int i=0;i<n;i++) {
			a=b+c;
			System.out.println(a);
			c=b;
			b=a;
		}

	}

}
