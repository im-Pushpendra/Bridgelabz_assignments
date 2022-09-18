package com.bridgelabz.day2;


import java.util.*;
public class Sumofnaturalbywhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Natural Number: ");
		int n = scan.nextInt();
		int a=0;
		int i=0;
		while(i < n)
		{
		i++;
		a +=i;
		}
		System.out.println("Sum of First "+n+" Natural Numbers is "+a);

	}

}
