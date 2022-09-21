package com.bridgelabz.day2;

public class Distance {

	public static void main(String[] args) {
		int x=0, y=0;
		x +=Integer.parseInt(args[0]);
		y +=Integer.parseInt(args[1]);
		int a=(int)Math.pow(x, 2);
		int b=(int)Math.pow(y, 2);
		float distance=(float)Math.sqrt(a+b);
		System.out.println("The Euclidean distance from the point ("+x+","+y+") to the origin (0,0) is: "+distance);

	}

}
