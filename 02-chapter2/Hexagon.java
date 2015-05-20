/*This program will prompt the user to enter the side of a hexagon and displays its area.
Formula for computing area of a hexagon is Area = ((3*3^1/2)/2) * s^2
Nicholas Perez
*/

import java.util.Scanner;

public class Hexagon {
	public static void main(String [] args) {
		
		//declaring variables and Scanner object
		double side, area;
		Scanner readin = new Scanner(System.in);	
		
		//Asking for input and reading it in to scanner object
		System.out.print("Eneter the side: ");
		side = readin.nextDouble();

		//perfomring calcualations and display result
		area = ( 3.0 * Math.pow(3.0,0.5) / 2 ) * Math.pow(side, 2);
		System.out.println("The area of the hexagon is " + area);
	}
}
