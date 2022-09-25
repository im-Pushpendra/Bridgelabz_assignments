package com.bridgelabz.day6;

import java.util.*;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scan.nextInt();
		int a=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println(i);
			a +=i;
			}
	}
		if(n==a)
			System.out.println(n+" is a Perfect Number");
		else
			System.out.println(n+" is Not a Perfect Number");
	}

}
