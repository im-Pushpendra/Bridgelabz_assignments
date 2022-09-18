package com.bridgelabz.day2;

import java.util.*;
public class Arithmeticoperations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = scan.nextInt();
		System.out.print("Enter b: ");
		int b = scan.nextInt();
		System.out.print("Enter c: ");
		int c = scan.nextInt();
		int d = a+b*c;
		int e = c+a/b;
		int f = a%b+c;
		int g = a*b+c;
		System.out.println("First Operation: "+d);
		System.out.println("Second Operation: "+e);
		System.out.println("Third Operation: "+f);
		System.out.println("Fourth Operation: "+g);
		if(d>e&&d>f&&d>g)
		System.out.println("Max Number: "+d);
		else if(e>f&&e>f)
		System.out.println("Max Number: "+e);
		else if(f>g)
		System.out.println("Max Number: "+f);
		else
		System.out.println("Max Number: "+g);
		if(d<e&&d<f&&d<g)
		System.out.println("Min Number: "+d);
		else if(e<f&&e<f)
		System.out.println("Min Number: "+e);
		else if(f<g)
		System.out.println("Min Number: "+f);
		else
		System.out.println("Min Number: "+g);

	}

}
