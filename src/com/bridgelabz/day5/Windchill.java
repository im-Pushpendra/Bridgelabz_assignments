package com.bridgelabz.day5;

public class Windchill {

	public static void main(String[] args) {
		int t = Integer.parseInt(args[0]);
		int v = Integer.parseInt(args[1]);
		double p = (double)Math.pow(v, 0.16);
		double W = 35.74+0.6215*t+(0.4275*t-35.75)*p;
		if(t<=50 && 3<=v && v<=120)
			System.out.println();
			System.out.println("Temperature is: "+t+" Fahrenheit");
			System.out.println("Wind speed is: "+v+" miles/hour");
			System.out.println("The Effective Temperature to be: "+W);

	}

}
