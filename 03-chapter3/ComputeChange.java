/*This program deals will Monetary units in a sense that what ever amount you, the users enters
it will display the amount of dollars and coins(quater, dime, nickel, penny) respectivly
Note: This program is mostly used from chapter 2 in the text introduction to java 10e

Nicholas Perez
*/

import java.util.Scanner;

public class ComputeChange {
	public static void main(String [] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an amount in double, for example 11.56: ");
		double amount = input.nextDouble();

		int remainingAmount = (int)(amount * 100);

		//find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;

		//Find the number of quaters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;

		//Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;

		//Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;

		//Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;

		//Displying results
		System.out.println("Your amount " + amount + " consists of");

		if(numberOfOneDollars == 1)
			System.out.println("    " + numberOfOneDollars + " dollar");
		else
			System.out.println("    " + numberOfOneDollars + " dollars");

		if(numberOfQuarters == 1)
			System.out.println("    " + numberOfQuarters + " quarter");
		else
			System.out.println("    " + numberOfQuarters + " quarters");

		if(numberOfDimes == 1)
			System.out.println("    " + numberOfDimes + " dimes");
		else
			System.out.println("    " + numberOfDimes + " dimes");

		if(numberOfNickels == 1)
			System.out.println("    " + numberOfNickels + " nickel");
		else
			System.out.println("    " + numberOfNickels + " nickels");

		if(numberOfPennies == 1)
			System.out.println("    " + numberOfPennies + " penny");
		else
			System.out.println("    " + numberOfDimes + " pennies");
	}
}
