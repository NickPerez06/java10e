/*
This program will prompt the user to enter a length form the center of a pentagon to a vertex. It will then compute
the area and display it on screen.
Nicholas Perez
*/

import java.util.Scanner;

public class Pentagon {
    public static void main(String[] args) {
      
      //creating varibles and scanner object
      double length, area, side;
      Scanner input = new Scanner(System.in);

      //Asking user for input and entering it in
      System.out.print("Enter the length from the center to a vertex: ");
      length = input.nextDouble();

      //Computing side of pentagon then area after words
      side = 2 * length * Math.sin(Math.PI / 5);

      area = ( 5 * Math.pow(side, 2) ) / ( 4 * Math.tan(Math.PI / 5) ); 

      //Displaying result
      System.out.printf("The area of the pentagon is %4.2f\n", area);
    }
}
