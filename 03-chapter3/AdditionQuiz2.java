/*This program will prompt the user to enter the sum of three single digit integers.
Nicholas Perez
*/

import java.util.Scanner;
	
public class AdditionQuiz2 {
	public static void main(String [] args) {

		//Generating random numbers form currentTimeMillis
		int number1 = (int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis() * 7 % 10);
		int number3 = (int) (System.currentTimeMillis() * 2 % 10);

		//Making Scanner
		Scanner input = new Scanner(System.in);
		
		//asking user for input
		System.out.print("What is " +number1+ "+" +number2+ "+" +number3+ "? ");
		
		int result = input.nextInt();

		//Displaying result
		System.out.println( number1 + "+" + number2 + "+" + number3 + " = " + result + " is " + (number1 + number2 + number3 == result));
	}
}
