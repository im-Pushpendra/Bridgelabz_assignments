package com.bridgelabz.day2;


import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = scan.nextInt();
		int a=0;
		int b=n;
		int c=0;
		for(int i=0;n>0;i++)
		{
		a = (a+n%10)*10;
		n /=10;
		c =a/10;
		}
		if(b == c)
		System.out.println("Number "+c+" is Palindrome Number");
		else
		System.out.println("Number "+c+" is not a Palindrome Number");

	}

}
