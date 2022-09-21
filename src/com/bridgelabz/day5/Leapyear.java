package com.bridgelabz.day5;

import java.util.*;
public class Leapyear {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Year: ");
		int a = sc.nextInt();
		if(a>999 && a<10000) {
		if(a%100==0 && a%400==0 || a%100!=0 && a%4==0)
		System.out.println(a+" is a Leap Year");
		else 
		System.out.println(a+" is a common year");
		}
		else
		System.out.println("Invalid Year");
	}

}
