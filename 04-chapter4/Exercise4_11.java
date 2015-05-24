/*
This program will prompt the user to enter an integer
between 0 and 15 and displays its corresponding hex number
Nicholas Perez
*/

import java.util.Scanner;

public class Exercise4_11 {
	public static void main(String [] args) {

		//creating varibles and Scanner object
		Scanner input = new Scanner(System.in);
		int number;

		//prompting user and reading in value
		System.out.print("Enter a decimal value (0 to 15): ");
		number = input.nextInt();

		//Below will be the conversion form decimal to hex
		
		if( number >= 0 && number < 10 ) {
			System.out.println("The hex value is " + number);
		}

		else{
			switch(number) {
				
				case 10: System.out.println("The hex value is A"); break;
				case 11: System.out.println("The hex value is B"); break;
				case 12: System.out.println("The hex value is C"); break;
				case 13: System.out.println("The hex value is D"); break;
				case 14: System.out.println("The hex value is E"); break;
				case 15: System.out.println("The hex value is F"); break;
				default: System.out.println(number + " is an invalid input");
			}
		}
	}
} 
