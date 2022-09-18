package com.bridgelabz.day3;

public class Fifthlargestnumber {

	public static void main(String[] args) {
		int [] arr = new int [] {25,11,7,75,56,12,87,98,45,99,99,87,11,7,99};
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
		System.out.println();
		int a=0;
		for (int i = arr.length-1; i >= 0; i--){
		for(int j = arr.length-2; j >= 0; j--){
		if (arr[i] > arr[j]){
		a = arr[j];
		//System.out.println("2nd Largest Number in an Array is: "+arr[j]);
		break;
		}
		}
		for(int j = arr.length-2; j >= 0; j--){
		if (a > arr[j]){
		a = arr[j];
		//System.out.println("3rd Largest Number in an Array is: "+arr[j]);
		break;
		}
		}
		for(int j = arr.length-2; j >= 0; j--){
		if (a > arr[j]){
		a = arr[j];
		//System.out.println("4th Largest Number in an Array is: "+arr[j]);
		break;
		}
		}
		for(int j = arr.length-2; j >= 0; j--){
		if (a > arr[j]){
		a = arr[j];
		System.out.println("5th Largest Number in an Array is: "+arr[j]);
		break;
		}
		}
		break;
		}
	}

}
