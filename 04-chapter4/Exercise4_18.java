/*
This program will prompt the user to enter two characters and displays the major and status represented in the characters.
The first character indicates the major and the second one indicates 1, 2, 3, 4 which is freshman, sophomore, junior, or senior.
Author: Nicholas Perez
*/

import java.util.Scanner;

public class Exercise4_18 {
	public static void main(String [] args) {
	
		//Stirng variable for reading input
		String Student_Status;
		
		//Scanner Object
		Scanner input = new Scanner(System.in);
	
		//prompting user and reading in value
		System.out.print("Enter two characters: ");
		Student_Status = input.nextLine();

		//Checking the status of student. Will throw error if not entered correctly 
		String major = Student_Status.substring(0,1);
		String status = Student_Status.substring(1);

		if ( major.equals("M") ) 
			System.out.print("Mathematics");
		else if ( major.equals("C") )
			System.out.print("Computer Science");
		else if ( major.equals("I") )
			System.out.print("Information Technology");
		else
			System.out.print("Invlaid Input");

		if( status.equals("1") )
			System.out.println(" Freshman");
		else if( status.equals("2") )
			System.out.println(" Sophomore");
		else if( status.equals("3") )
			System.out.println(" Junior");
		else if( status.equals("4") )
			System.out.println(" Senior");
		else
			System.out.print("Invalid Input");
	}
}
