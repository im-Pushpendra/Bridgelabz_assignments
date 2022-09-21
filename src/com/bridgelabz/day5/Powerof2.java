package com.bridgelabz.day5;

public class Powerof2 {

	public static void main(String[] args) {
		System.out.println("The power table of 2 is: ");
		int n = Integer.parseInt(args[0]);
		int a=1;
		for(int i=1;i<=n;i++) {
			a *=2;
		System.out.println(a);
		}

	}

}
