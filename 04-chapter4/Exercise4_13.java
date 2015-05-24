/*
This program will prompt the user to enter a letter and check to see
if it is a vowel or constant.
Author: Nicholas Perez
*/

import java.util.Scanner;

public class Exercise4_13 {
	public static void main(String [] args) {
		
		//creating variables for char and string
		String thisLine;
		char thisChar;

		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		//Creating strings for constants and vowels
		String Constants = "bcdfghjklmnpqrstvwxyz";
		String vowels = "aeiou";

		//prompting user and reading in value
		System.out.print("Enter a letter: ");
		thisLine = input.nextLine();
		thisChar = thisLine.charAt(0);

		//Now comparing if the letter is a vowel or constant. But first converting character to string
		String newChar = Character.toString(thisChar);

		if( Constants.contains(newChar) ) {
			System.out.println(newChar + " is a constant");
		}

		else if ( vowels.contains(newChar) ) {
			System.out.println(newChar + " is a vowel");
		}

		else
			System.out.println(newChar + " is an invalid input");
	}
}
		
