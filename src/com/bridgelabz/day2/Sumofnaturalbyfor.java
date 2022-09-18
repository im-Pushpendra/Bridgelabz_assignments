package com.bridgelabz.day2;

import java.util.*;
public class Sumofnaturalbyfor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Natural Number: ");
		int n = scan.nextInt();
		int a=0;
		for(int i=1;i<=n;i++)
		a +=i;
		System.out.println("Sum of First "+n+" Natural Numbers is "+a);

	}

}
