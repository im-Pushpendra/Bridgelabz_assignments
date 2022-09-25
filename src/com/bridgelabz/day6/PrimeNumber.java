package com.bridgelabz.day6;

import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scan.nextInt();
		boolean b=false;;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				b=true;
		break;
			}
	}if(b==false)
		System.out.println(n+" is Prime Number");
	else
		System.out.println(n+" is Not a Prime Number");
	}

}
