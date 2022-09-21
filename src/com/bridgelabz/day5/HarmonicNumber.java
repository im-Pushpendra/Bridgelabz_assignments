package com.bridgelabz.day5;

import java.util.*;
public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Harmonic number N: ");
		float N = scan.nextInt();
		float a=0;
		for(float i=1;i<=N;i++) {
			a +=1/i;
		}
		System.out.println("The Nth Harmonic value is: "+a);

	}

}
