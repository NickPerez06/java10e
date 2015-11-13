/*
This program will print two tables; Miles to Kilometers and vice versa
Author: Nicholas Perez
*/

public class Exercise5_6 {
	public static void main (String [] args) {

		//variables for tables
		final double MILE_TO_KILOME = 1.609;
		int Miles = 1, Kilometers = 20;

		System.out.printf("%-10s%-10s  |  %-10s   %-10s\n", "Miles", "Kilometers", "Kilometers", "Miles");

		while( Miles < 11 && Kilometers <=65) {
			System.out.printf("%-10d%-10.3f  |  %-10d   %-10.3f\n", Miles, (Miles * MILE_TO_KILOME), Kilometers, (Kilometers / MILE_TO_KILOME) );
			Miles ++;
			Kilometers += 5;
		}
	}
}

