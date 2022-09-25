package com.bridgelabz.day5;

import java.util.*;
public class Factors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		System.out.println("Prime Factors are: ");
		for(int i=2;i<=n;i++) {
			while(n%i==0) {
				n /=i;
		System.out.println(i);
			}
		}

	}

}
