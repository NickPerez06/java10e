/*This program will ask the user to enter three integers and then
display them in non-decreasing order

Nicholas Perez
*/

import java.util.Scanner;

public class Sortint {
	public static void main(String [] args) {
		
		//Scanner object
		Scanner input = new Scanner(System.in);
		
		//prompting user and reading in input
		System.out.print("Enter three integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();	
		int number3 = input.nextInt();

		if(number1 > number2){
			int temp = number1;
			number1 = number2;
			number2 = temp;

		}


		if(number2 > number3) {
			int temp = number2;
			number2 = number3;
			number3 = temp;
		}

		if(number1 > number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}

		System.out.println("The numbers in non decreasing order: " + number1 + " " + number2 + " " + number3);
	}
}
