/*
This program will prompt the user to enter the number of sides and their length of a regular polygon
and display its area.
Nicholas Perez
*/

import java.util.Scanner;

public class AreaPolygon {
    public static void main(String [] args) {
    

        //variables for side length and number of slides
        double NUM_OF_SIDES;
	double SIDE_LENGTH, area;
	Scanner input = new Scanner(System.in);

	//Asking user for input
	System.out.print("Enter the number of sides: ");
	NUM_OF_SIDES = input.nextInt();

	System.out.print("Enter the side: ");
	SIDE_LENGTH = input.nextDouble();

	//Computing input and displaying results
	area = NUM_OF_SIDES * Math.pow(SIDE_LENGTH, 2) / (4 * Math.tan( Math.PI / NUM_OF_SIDES ) );

	System.out.println("The area of the polygon is " + area );
    }
}
