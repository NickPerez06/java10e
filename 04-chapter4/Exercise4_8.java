/*
The purpose of this program is to recieve an ASCII code and displays its character
Hint: ASCII ranges from an integer 0 - 127.
Nicholas Perez
*/

import java.util.Scanner;

public class Exercise4_8 {
	public static void main(String [] args) {

		//creating variables for ASCII code change and a Scanner object
		Scanner input = new Scanner(System.in);
		int numExtract;
		char Comsume;

		//asking user for input and reading in values
		System.out.print("Enter an ASCII code: ");
		numExtract = input.nextInt();

		//casting int read form user into char type and printing result to screen
		Comsume = (char) numExtract;
		System.out.println("The character for ASCII code " + numExtract + " is " + Comsume);
	}
}

