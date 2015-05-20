/*
This program will play the popular rock-paper-scissor game. The numbers 0, 1, and 2 will represent
scissor, rock, and paper respectivly. The progra will randomly generate a number for the computer, and ask the user to enter
0, 1, 2
Nicholas Perez
*/

import java.util.Scanner;

public class Game {
	public static void main(String [] args) {
	
		//creating random generater for the computer
		int PC_GUESS = (int)(Math.random() * 3);					//generates number from 0-2
		int USER_GUESS;

		//Scanner object
		Scanner input = new Scanner(System.in);

		//Promting user to enter their choice
		System.out.print("scissor (0), rock (1), paper(2): ");
		USER_GUESS = input.nextInt();

		
		//creating game for user and computer
		
		if(PC_GUESS == USER_GUESS) {

			if(PC_GUESS == 0 && USER_GUESS == 0)
				System.out.println("The computer is scissor. You are scissor. It is a draw");
			else if (PC_GUESS == 1 && USER_GUESS == 1)
				System.out.println("The computer is rock. You are rock. It is a draw");
			else
				System.out.println("The computer is paper. You are paper. It is a draw");
		}

		else if (PC_GUESS == 0 && USER_GUESS == 1)
				System.out.println("The computer is scissor. You are rock. You won");
		else if (PC_GUESS == 0 && USER_GUESS == 2)
				System.out.println("The computer is scissor. You are paper. You lose");
		else if (PC_GUESS == 1 && USER_GUESS == 0)
				System.out.println("The computer is rock. You are scissor. You lose");
		else if (PC_GUESS == 1 && USER_GUESS == 2)
				System.out.println("The computer is rock. You are paper. You won");
		else if (PC_GUESS == 2 && USER_GUESS == 0)
				System.out.println("The computer is paper. You are scissor. You won");
		else if (PC_GUESS == 2 && USER_GUESS == 1)
				System.out.println("The computer is paper. You are rock. You lose");
	}
}
