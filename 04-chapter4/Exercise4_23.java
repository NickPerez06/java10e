/*
This program will print a payroll statment about an employee.
Nicholas Perez
*/

import java.util.Scanner;

public class Exercise4_23 {
	public static void main(String [] args) {

		//variables for Name, hours, pay rate, Federal and state tax
		String NAME;
		int HOURS;
		double PAY_RATE, FEDERAL_TAX, STATE_TAX;

		//Scanner object
		Scanner input = new Scanner(System.in);

		//Prompting user for info and reading it in
		System.out.print("Enter employee's name: ");
		NAME = input.next();

		System.out.print("Enter number of hours worked in a week: ");
		HOURS = input.nextInt();
		
		System.out.print("Enter hourly pay rate: ");
		PAY_RATE = input.nextDouble();

		System.out.print("Enter federal tax withholding rate: ");
		FEDERAL_TAX = input.nextDouble();

		System.out.print("Enter state tax withholding rate: ");
		STATE_TAX = input.nextDouble();

		//Performing calculations and deductions
		double GROSS_PAY = HOURS * PAY_RATE;
		double FED_DEDUC = GROSS_PAY * FEDERAL_TAX;
		double STATE_DEDUC = GROSS_PAY * STATE_TAX;

		double TOTAL_DEDUC = FED_DEDUC + STATE_DEDUC;
		double NET_PAY = GROSS_PAY - TOTAL_DEDUC;

		//Printing to console output
		System.out.println(" ");
		System.out.println("Employee Name: " + NAME);
		System.out.println("Hours Worked: " + (double) HOURS);
		System.out.println("Pay Rate: $" + PAY_RATE);
		System.out.println("Gross Pay: $" + GROSS_PAY);
		System.out.println("Deductions:");

		System.out.printf("  Federal Withholdings (%1.1f%%): $%1.2f\n" +
						  "  State WithHoldings (%1.1f%%): $%1.2f\n" +
						  "  Total Deductions: $%1.2f\n" +
						  "Net Pay: $%1.2f\n",
						  FEDERAL_TAX * 100, FED_DEDUC, STATE_TAX * 100,
						  STATE_DEDUC, TOTAL_DEDUC, NET_PAY);		

	}
}
		
