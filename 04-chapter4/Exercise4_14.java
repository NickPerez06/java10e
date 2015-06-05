/*
This program will prompt the user to enter a letter grade of A, B, C, D, or F and displays it corresponding 
numeric value 4, 3, 2, 1, or 0.
Author: Nicholas Perez
*/

import java.util.Scanner;

public class Exercise4_14 {
	public static void main(String [] args) {

		//Creating scanner object and needed variables
		Scanner input = new Scanner(System.in);
		int number = 0;

		//Prompting the user for input
		System.out.print("Enter a letter grade: ");
		char grade = input.nextLine().charAt(0);

		//converting input to numeric output by grade
		if (Character.toUpperCase(grade) == 'A' )
			number = 4;

		else if (Character.toUpperCase(grade) == 'B' )
			number = 3;

		else if (Character.toUpperCase(grade) == 'C' )
			number = 2;

		else if (Character.toUpperCase(grade) == 'D' )
			number = 1;
		
		else if (Character.toUpperCase(grade) == 'F' )
			number = 0;

		else{
			System.out.println(grade + " is an invalid grade");
			System.exit(1);
		}

		System.out.println("The numeric value for grade " + grade + " is " + number);
	}
}
