/*This program will calculate the energy needed to heat water from an initial temperature to a final temperture.
It will prompt the user to enter the amount of water in kilograms as well as the initial and final temperatures

The formula to compute energy is as follows:

Q = M * (finalTemperature - initialTemperature) * 4184

Note M is weight of water in kilograms, temperatures are in degree celcius and Q is measured in joules.

Nicholas Perez
*/

import java.util.Scanner;

public class Energy {
	public static void main(String [] args) {
		
		//declaring variables and scanner object
		double water, int_temp, fin_temp;
		Scanner input = new Scanner(System.in);

		//asking user for input and reading it in
		System.out.print("Enter the amount of water in kiolgrams: ");
		water = input.nextDouble();	

		System.out.print("Enter the initial temperature: ");
		int_temp = input.nextDouble();

		System.out.print("Enter the final temperature: ");
		fin_temp = input.nextDouble();

		//performing calculations and displaying result
		double result = water * (fin_temp - int_temp) * 4184;

		System.out.println("The energy needed is " + result);
	}
}
