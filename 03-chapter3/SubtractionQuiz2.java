/*This program will generate a addition question with two integers less than 100
Nicholas Perez
*/

import java.util.Scanner;

public class SubtractionQuiz2 {
	public static void main(String [] args) {

		//generating two random integers form 0 - 99
		int number1 = (int)(Math.random() * 100);
		int number2 = (int)(Math.random() * 100);
		Scanner input = new Scanner(System.in);

		//asking user for answer to problem
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();

		if(number1 + number2 == answer)
			System.out.println("You are correct!");

		else {
			System.out.println("Your answer is wrong.");
			System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2) );
		}
	}
}
