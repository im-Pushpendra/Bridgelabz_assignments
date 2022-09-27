package com.bridgelabz.day6;

import java.util.*;
public class VendingMachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Amount: ");
		int n = sc.nextInt();
		int[] arr = {1000,500,100,50,10,5,2,1};
		int note = 0,a=0;
		while(n>0) {
			int count =0;
		System.out.println("Remaining money: " + n);
		while(n>=arr[note]) {
			n = n-arr[note];
			count++;
		}
		System.out.println(arr[note]+"X"+count);
		note++;
		a +=count;
		}System.out.println("Total Numbers of Notes are: "+a);

	}

}
