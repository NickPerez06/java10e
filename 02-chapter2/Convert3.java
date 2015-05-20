/*This program will convert punds (entered by the user) into kilograms.
Nicholas Perez
*/

import java.util.Scanner;

public class Convert3 {
	public static void main(String [] args) {

		//declaring conversion as constant
		final double KILO = 0.454;

		//Creating Scanner object and variables as needed
		Scanner input = new Scanner(System.in);

		double conversion, pounds;

		//asking user for input and reading it in
		System.out.print("Enter a number in punds: ");
		pounds = input.nextDouble();

		//doing the calculations and displaying result
		conversion = pounds * KILO;
		System.out.println(pounds + "pounds is " + conversion + " kilograms");
	}
}
