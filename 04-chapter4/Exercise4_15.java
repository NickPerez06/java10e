/*
This program will prompt the user to enter a letter and displays its corresponding number.
It is bassed on international standard letter/ number mapping found on telephones
Author: Nicholas Perez
*/

import java.util.Scanner;

public class Exercise4_15 {
	public static void main(String [] args) {
		
		//creating Scanner object and variables as needed
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		char letter = input.nextLine().charAt(0);

		//will convert the letter(uppercase or lowercase) to its right number
		//first converitng character to string
		String this_letter = Character.toString(letter);

		String key2 = "ABCabc";
		String key3 = "DEFdef";
		String key4 = "GHIghi";
		String key5 = "JKLjkl";
		String key6 = "MNOmno";
		String key7 = "PQRSpqrs";
		String key8 = "TUVtuv";
		String key9 = "WXYZwxyz";

		if ( key2.contains(this_letter) )
			System.out.println("The corresponding number is 2");

		else if (key3.contains(this_letter) )
			System.out.println("The corresponding number is 3");

		else if (key4.contains(this_letter) )
			System.out.println("The corresponding number is 4");

		else if (key5.contains(this_letter) )
			System.out.println("The corresponding number is 5");

		else if (key6.contains(this_letter) )
			System.out.println("The corresponding number is 6");

		else if (key7.contains(this_letter) )
			System.out.println("The corresponding number is 7");
		
		else if (key8.contains(this_letter) )
			System.out.println("The corresponding number is 8");

		else if (key9.contains(this_letter) )
			System.out.println("The corresponding number is 9");

		else
			System.out.println(this_letter + " is an invalid input");
	}
}
