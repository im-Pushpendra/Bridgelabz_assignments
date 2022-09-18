package com.bridgelabz.day2;

import java.util.*;
public class Reversetheintegerbyfor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = scan.nextInt();
		int a=0;
		for(int i=0;n>0;i++)
		{
		a = (a+n%10)*10;
		n /=10;
		}
		System.out.println("Reverse of the Number is: "+(a/10));

	}

}
