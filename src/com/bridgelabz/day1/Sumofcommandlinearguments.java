package com.bridgelabz.day1;

public class Sumofcommandlinearguments {

	public static void main(String[] args) {
		int cnt=0, sum=0;
		for(int i=0;i<args.length;i++)
		{
		try
		{
		sum +=Integer.parseInt(args[i]);
		}
		catch (NumberFormatException e)
		{
		cnt++;
		}
		}
		System.out.println("Sum of only valid integers is= "+sum) ;

		System.out.println("Invalid integers are: "+cnt) ;
	}

}
