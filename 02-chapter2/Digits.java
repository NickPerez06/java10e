/*This program will read an integer between 0 and 1000 and add all the digits in in the number.
Nicholas Perez
*/

import java.util.Scanner;

public class Digits {
	public static void main(String [] args) {
		
		//creating variables and Scanner Object
		int amount, total, ones, tens, hundreds;
		Scanner readin = new Scanner(System.in);
	
		//Asking user for input and reading it in.
		System.out.print("Enter a number between 0 and 100: ");
		amount = readin.nextInt();
	
		//perfroming caluclations and dislpaying result using % to extract digit and / to remove the digit
		
		ones = amount % 10;
		tens = (amount /10) % 10;
		hundreds = (amount /100) % 10;
		total = ones + tens + hundreds;

		System.out.println("The sum of the digits is " + total);
	}
}
