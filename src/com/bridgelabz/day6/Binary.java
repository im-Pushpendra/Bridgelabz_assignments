package com.bridgelabz.day6;

import java.util.Scanner;

public class Binary {
	
	static int swapNibbles(int x)
	{
	    return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
	}
	
/*	static int swapNibbles(int N) {
	      // Step 1
	        int right = (N & 0b00001111);
	      // Step 3
	        right= (right<<4);
	      // Step 2
	        int left = (N & 0b11110000);
	      // Step 4
	        left = (left>>4);
	      // Step 5
	        return (right | left);
	}
*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = scanner.nextInt();

		int binary = swapNibbles(num);
		System.out.println("Binary value of " + num + " = " + binary);

		
	}

}
