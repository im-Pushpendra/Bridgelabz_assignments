package com.bridgelabz.day5;

import java.util.*;
public class FlipCoinPercentage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		System.out.print("The number of times to flip coin: ");
		float a = scan.nextInt();
		float countTails=0,countHeads=0;
		for(int i=1;i<=a;i++) {
		int b = random.nextInt(2);
		if(b==1) {
			countTails++;
			System.out.println("Tails");
		}
		else {
			countHeads++;
			System.out.println("Heads");
		}
	}
		System.out.println("countTails: "+countTails+" in percentage is: "+((countTails/a)*100)+" %");
		System.out.println("countHeads: "+countHeads+" in percentage is: "+((countHeads/a)*100)+" %");

}
}
