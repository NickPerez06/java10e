/*This program will ask the user to enter a three digit number to see if i is a palindrome of not
Nicholas Perez
*/

import java.util.Scanner;

public class Palindrome {
	public static void main(String [] args) {

		//creating vaiarbles and Scanner object
		int palindrome;
		Scanner input = new Scanner(System.in);

		//prompting user and reading in values
		System.out.print("Enter a three digit integer: ");
		palindrome = input.nextInt();

		//pefroming calcualtions and dispying results
		int last_digit = palindrome % 10;		//extracting last digit
			
		int newNum = palindrome / 100;		

		int first_digit = newNum % 100;		//extracting first digit

		if(last_digit == first_digit)
			System.out.println(palindrome + " is a Palidrome");

		else
			System.out.println(palindrome + " is not a Palindrome");
	}
}
