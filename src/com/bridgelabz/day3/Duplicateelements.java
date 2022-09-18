package com.bridgelabz.day3;

public class Duplicateelements {

	public static void main(String[] args) {
		int [] arr = new int [] {25,11,7,75,56,12,87,98,45,99,99,87,11,7};
		System.out.println("Duplicate elements in given array: ");
		for(int i = 0; i < arr.length; i++){
		for(int j = i+1; j < arr.length; j++){
		if (arr[i] == arr[j])
		System.out.println(arr[i]);
		}
		}

	}

}
