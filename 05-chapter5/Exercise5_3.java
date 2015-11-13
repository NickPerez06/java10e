/*
The purpose of this program is to print a table showing the conversion from kilograms to pounds from 1 to 200.
Note: 1 kilogram is 2.2 pounds. Will use loops and printf statements to alter table's look
Author: Nicholas Perez
*/

public class Exercise5_3 {
	public static void main (String [] agrs ) {

		//variables for conversion
		final double KILO_TO_POUNDS = 2.2;
		

		//Top of table
		System.out.println("Kilograms      Pounds");

		//Will use for loop for printing table
		for(int i = 1; i <200; i++) {

			System.out.printf("%-10d%10.2f%n",i, (i * KILO_TO_POUNDS));
	
		}
	}
}
