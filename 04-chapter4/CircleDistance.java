/*
This program will ask the user to enter the latitude and longitude of tow points on the earth
in degrees and display it great circle distance.
Note: Average earth radius is 6,371.01 km
Also use negative degrees to indicate south and east.
Nicholas Perez
*/

import java.util.Scanner;

public class CircleDistance {
    public static void main(String [] args) {
    
        final double earth_rad = 6371.01; 

        //creating variables and scanner object
        Scanner input = new Scanner(System.in);
        double X1, Y1, X2, Y2, distance, newX1, newX2, newY1, newY2; 

        //promting user and reading in values
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        X1 = input.nextDouble();
        Y1 = input.nextDouble();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        X2 = input.nextDouble();
        Y2 = input.nextDouble();

        //converting degrees into radians then putting it into formula
        newX1 = Math.toRadians(X1);
        newY1 = Math.toRadians(Y1);
        newX2 = Math.toRadians(X2);
        newY2 = Math.toRadians(Y2);

        //formula for great circle distance below
        
        distance = earth_rad * Math.acos( Math.sin(newX1) * Math.sin(newX2) + Math.cos(newX1) * Math.cos(newX2) * Math.cos(newY1 - newY2) );
        //displaying result
        System.out.println("The distance between two points is " + distance+ " km");
    }
}
