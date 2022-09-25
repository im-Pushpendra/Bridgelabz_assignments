package com.bridgelabz.day5;

public class SumofThreeIntegers {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,-10,-1,-15,-2,-3,-4,-5,-6,-7,-8,-9};
		int b=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length-1;j++)
				for(int k=j+1;k<a.length-2;k++)
					if(a[i]+a[j]+a[k]==0)
					System.out.println(a[i]+"+"+a[j]+"+"+a[k]+" = 0");
					b++;
		}System.out.println();
		System.out.println("Number of distinct triplets: "+b);

	}

}
