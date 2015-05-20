/*This program will prompt the user to enter a monty savings amount and display the value after the six month
Nicholas Perez
*/

import java.util.Scanner;

public class Compound {
	public static void main(String [] args) {
		
		//Declaring variables adn Scanner object
		double savings;
		Scanner readin = new Scanner(System.in);

		//reading value and performing calculations
		System.out.print("Enter the monthly saving amount: ");
		savings = readin.nextDouble();
		
		double firstmonth = savings * (1 + 0.00417);
		double secondmonth = (savings + firstmonth) * (1 + 0.00417);
		double thirdmonth = (savings + secondmonth) * (1 + 0.00417);
		double fourthmonth = (savings + thirdmonth) * (1 + 0.00417);
		double fifthmonth = (savings + fourthmonth) * (1 + 0.00417);
		double sixthmonth = (savings + fifthmonth) * (1 + 0.00417);

		//Dislpaying specfic result
		System.out.println("After the sixth month, the account value is $" + sixthmonth);
	}
}
