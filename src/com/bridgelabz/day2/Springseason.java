package com.bridgelabz.day2;

public class Springseason {

	public static void main(String[] args) {
		int m=Integer.parseInt(args[0]);
		int d=Integer.parseInt(args[1]);
		boolean b=false;

		if(m==3){
		if(d>=20 && d<=31)
		b=true;
		System.out.println(b);
		}
		else if(m==4){
		if(d>=1 && d<=30)
		b=true;
		System.out.println(b);
		}
		else if(m==5){
		if(d>=1 && d<=31)
		b=true;
		System.out.println(b);
		}
		else if(m==6){
		if(d>=1 && d<=20)
		b=true;
		System.out.println(b);
		}
		else
		System.out.println(b);

	}

}
