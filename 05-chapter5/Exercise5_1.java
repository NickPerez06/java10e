/*
The purpose of this program is to read an uspecfied number of integers,
check how many positive and ngeative numbers there are, computuing the totaland avergae of the numbers entere
Author:Nicholas Perez
*/

import java.util.Scanner;

public class Exercise5_1 {
	
	public static void main (String [] args) {

		//variables TOTAL for sum of numbers entered, AVG for average, NUM for numbers being entered
		int TOTAL = 0;
		int POS = 0;
		int NEG = 0;
		float AVG;
		int NUM;
		int count=0;			//used for AVG computation

		//Scanner object for reading
		Scanner input = new Scanner(System.in);

		//Asking user to enter numbers one single line using hasNextInt() method
		System.out.print("Enter an integer, the input ends if it is 0: ");
	
		while(input.hasNextInt() ) {
			NUM = input.nextInt();
			if( NUM == 0 )
				break; 

			if(NUM > 0) {
				POS++;
				TOTAL += NUM;
			}
			
			else {
				NEG++;
				TOTAL += NUM;
			}
		
		count++;
		}

		if( TOTAL == 0 )
			System.out.println("No Numbers are entered except 0");

		else {	
	
			System.out.println("The number of positives is " + POS);
			System.out.println("The number of negatives is " + NEG);
			System.out.println("The total is " + TOTAL);

		 	AVG = (float) (TOTAL) / (count);
		
			System.out.println("The Average is " + AVG);
		}
	}
}

