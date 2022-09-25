package com.bridgelabz.day5;

import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value of a: ");
		int a = scan.nextInt();
		System.out.print("Enter value of b: ");
		int b = scan.nextInt();
		System.out.print("Enter value of c: ");
		int c = scan.nextInt();
		int delta = b*b-4*a*c;
		System.out.println();
		int x1 = (-b+(int)Math.sqrt(delta))/(2*a);
		int x2 = (-b-(int)Math.sqrt(delta))/(2*a);
		System.out.println();
		System.out.println("Roots of x are: ");
		System.out.print("x1: "+x1);
		System.out.println();
		System.out.print("x2: "+x2);

	}

}
