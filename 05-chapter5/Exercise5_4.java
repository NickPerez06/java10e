/*
The purpose of this program is to show a table from miles to kilometers from 1 - 10.
Note: 1 mile is equal to 1.609 kilometers. Will use formmating output and loops to do the table.
Author: Nicholas Perez
*/

public class Exercise5_4 {
	public static void main (String [] args) {

		//variables for the table
		final double MILE_TO_KILOMETERS = 1.609;
		int limit = 1;

		System.out.printf("%-10s%10s%n", "Miles", "Kilometers");

		while( limit < 11 ) {

			System.out.printf("%-10d%10.3f%n", limit, (limit * MILE_TO_KILOMETERS));
			limit++;
		}
	}
}
