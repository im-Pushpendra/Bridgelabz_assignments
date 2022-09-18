package com.bridgelabz.day3;

public class Ascendingorder {

	public static void main(String[] args) {
		int [] arr = new int [] {25,11,7,75,56,12,87,98,45,99,99,87,11,7};
		System.out.println("Elements of original array: ");
		for (int i = 0; i < arr.length; i++){
		System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr.length; i++){
		int temp=0;
		for(int j = i+1; j < arr.length; j++){
		if (arr[i] > arr[j]){
		temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
		}
		}
		}
		System.out.println();
		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		}

	}

}
