package com.bridgelabz.day2;


import java.util.*;
public class Reversetheintegerbywhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = scan.nextInt();
		int a=0;
		while(n > 0)
		{
		a = (a+n%10)*10;
		n /=10;
		}
		System.out.print("Reverse of the Number is: "+(a/10));

	}

}
