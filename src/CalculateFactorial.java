
//Benjamin McBrayer, 4.26.2018
//This Java console program calculates the factorial of a number.

import java.util.Scanner;

public class CalculateFactorial {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int userNum;
		String userInfo = null;
		String playAgain = null;

		System.out.println("Welcome to the Factorial Calculator!");

		// Ask for user information.
		System.out.print("Please enter your name: ");
		userInfo = scnr.next();
		System.out.println("Hello, " + userInfo + "!");

		do {// Prompt user to enter an integer.
			long f = 1;
			System.out.println("Enter an integer that's greater than 0 but less than 20: ");
			userNum = scnr.nextInt();
			// Verify that 0 < userNum < 20.
			if (userNum > 0 && userNum < 20) {
				// Calculate the factorial.
				for (int i = 1; i <= userNum; ++i) {
					f = f * i;
				}
				System.out.println("The factorial of " + userNum + " is " + f + ".");
			} else {
				System.out.println("Your number is not within the specified range.");
			}

			// Ask if the user wants to continue entering numbers.
			System.out.println();
			System.out.println(userInfo + ", would you like to continue (y/n)?");
			playAgain = scnr.next();
			scnr.nextLine();

		} while (playAgain.equalsIgnoreCase("y"));

		System.out.println("Goodbye, " + userInfo + "!");

		scnr.close();
	}

}
