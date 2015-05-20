/*This program will prompt the user to entering the starting velocity in meters per second
the ending velocity in meters per second and the time span in seconds to display the average acceleration
Note: formula for Average Acceleration is:

A = (V1 - V0)/(T)

V1 = Ending velocity
V0 = Starting velocity
T = time

Nicholas Perez
*/

import java.util.Scanner;

public class Acceleration {
	public static void main(String [] args) {
		
		//Declaring variables and Scanner object
		double s_vel, e_vel, time, Acc;
		Scanner read_in = new Scanner(System.in);

		//reading in values and performing calculations
		System.out.print("Enter v0, v1 and t: ");
		s_vel = read_in.nextDouble();
		e_vel = read_in.nextDouble();
		time = read_in.nextDouble();

		Acc = (e_vel - s_vel) / (time);

		//displaying results
		System.out.println("The average acceleration is " + Acc);
	}
}
