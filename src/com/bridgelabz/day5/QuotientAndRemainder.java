package com.bridgelabz.day5;

import java.util.*;
public class QuotientAndRemainder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Dividend: ");
		int a = scan.nextInt();
		System.out.println("Enter Divisor: ");
		int b = scan.nextInt();
		
		System.out.println("Quotient: "+(a/b));
		System.out.println("Remainder: "+(a-((a/b)*b)));

	}

}
