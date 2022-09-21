package com.bridgelabz.day2;

import java.util.*;
public class Vowelorconsonant {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Character: ");
		String vowel = scan.next();//.charAt(0);
		switch(vowel)
		{
		case "A": System.out.println("'A' is a Vowel");
		break;
		case "E": System.out.println("'E' is a Vowel");
		break;
		case "I": System.out.println("'I' is a Vowel");
		break;
		case "O": System.out.println("'O' is a Vowel");
		break;
		case "U": System.out.println("'U' is a Vowel");
		break;
		case "a": System.out.println("'a' is a Vowel");
		break;
		case "e": System.out.println("'e' is a Vowel");
		break;
		case "i": System.out.println("'i' is a Vowel");
		break;
		case "o": System.out.println("'o' is a Vowel");
		break;
		case "u": System.out.println("'u' is a Vowel");
		break;
		default: System.out.println(vowel+" is a Consonant");
		break;

	}
	

}
}
