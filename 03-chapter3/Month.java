/*This program will generate a random number form 1 -12 and display the month in
relation to that number.

Nicholas Perez
*/

public class Month {
	public static void main(String [] args) {
	
		//generating random number
		int monthNumber = (int) (Math.random() * 12 + 1);

		if(monthNumber == 1)
			System.out.println("The number " + monthNumber + " refers to the month: January");
		
		else if(monthNumber == 2)
			System.out.println("The number " + monthNumber + " refers to the month: February");

		else if(monthNumber == 3)
			System.out.println("The number " + monthNumber + " refers to the month: March");

		else if(monthNumber == 4)
			System.out.println("The number " + monthNumber + " refers to the month: April");

		else if(monthNumber == 5)
			System.out.println("The number " + monthNumber + " refers to the month: May");

		else if(monthNumber == 6)
			System.out.println("The number " + monthNumber + " refers to the month: June");

		else if(monthNumber == 7)
			System.out.println("The number " + monthNumber + " refers to the month: July");

		else if(monthNumber == 8)
			System.out.println("The number " + monthNumber + " refers to the month: August");

		else if(monthNumber == 9)
			System.out.println("The number " + monthNumber + " refers to the month: September");
		
		else if(monthNumber == 10)
			System.out.println("The number " + monthNumber + " refers to the month: October");

		else if(monthNumber == 11)
			System.out.println("The number " + monthNumber + " refers to the month: November");

		else
			System.out.println("The number " + monthNumber + " refers to the month: December");
	}
}
