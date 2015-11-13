/*
This program will print a table from kilograms to pounds and pounds to kilograms side by side
Author:Nicholas Perez
*/

public class Exercise5_5 {
	public static void main (String [] args) {


		//variable for tables
		final double KILO_TO_LBS = 2.2;
		int i = 1, j = 20;
		
		//creating table useing formatted print and loops
		System.out.printf("%-10s%10s  |  %-10s%10s\n", "Kilograms", "Pounds", "Pounds", "Kilograms");

		while(i < 200 && j <= 515) {
			System.out.printf("%-10d%10.1f  |  %-10d%10.2f\n", i, (i * KILO_TO_LBS), j, (j / (KILO_TO_LBS) ) );
			i = i + 2;
			j = j + 5;
		}

	}
}
