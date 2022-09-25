package com.bridgelabz.day5;

import java.util.*;
public class VowelOrConsonents {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Alphabet: ");
		char ch = scan.next().charAt(0);
		if(ch=='a'||ch=='A')
			System.out.print(ch+" is Vowel");
		else if(ch=='e'||ch=='E')
			System.out.print(ch+" is Vowel");
		else if(ch=='i'||ch=='I')
			System.out.print(ch+" is Vowel");
		else if(ch=='o'||ch=='O')
			System.out.print(ch+" is Vowel");
		else if(ch=='u'||ch=='U')
			System.out.print(ch+" is Vowel");
		else
			System.out.print(ch+" is Consonent");

	}

}
