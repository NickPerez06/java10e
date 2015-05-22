/*
This program will recieve a character and display its unicode equivalent
Nicholas Perez
*/

import java.util.Scanner;

public class Exercise4_9 {
	public static void main(String [] args) {
		
		//creaitng varaibles for int and char
		char charConsume;

		//Creating Scanner object and prompting user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		
		String entireLine = input.nextLine();
		charConsume = entireLine.charAt(0);

		//Displaying result with casting
		System.out.println("The Unicode for the character " + charConsume + " is " + (int)charConsume);
	}
}
