/*This program will ask the uer to enter a 9 digit ISBN number. The last digit will check the sum of the previous nine digits.
If the sum is greater than 10 the last digit will be replaced by an X.

formula for the checksum is: (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11

Nicholas Perez
*/

import java.util.Scanner;

public class Isbn {
	public static void main(String [] args) {

		//Scanner object and variables
		Scanner input = new Scanner(System.in);
		int number1, number2, number3, number4, number5, number6, number7, number8, number9, number10;

		//prompting user to enter numbers and reading it in
		System.out.print("Enter the first 9 digits of ISBN as integer: ");
		number10 = input.nextInt();
		
	
		//extracting numbers one by one
		number9 = number10 % 10;
		number10 = number10 / 10;
	
		number8 = number10 % 10;
		number10 = number10 / 10;

		number7 = number10 % 10;
		number10 = number10 / 10;

		number6 = number10 % 10;
		number10 = number10 /10;
		
		number5 = number10 % 10;
		number10 = number10 /10;

		number4 = number10 % 10;
		number10 = number10 / 10;

		number3 = number10 % 10;
		number10 = number10 / 10;

		number2 = number10 % 2;
		number10 = number10 / 10;

		number1 = number10;


		//Now for the checksum
		int checksum = ( (number1 * 1) + (number2 * 2) + (number3 * 3) + (number4 * 4) + (number5 * 5) + (number6 * 6) + (number7 * 7) + (number8 * 8) + (number9 * 9) ) % 11;

		if( checksum == 10)
			System.out.println("The ISBN-10 number is " + number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + "X");
		else
			System.out.println("The ISBN-10 number is " + number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + checksum);

	}
}
