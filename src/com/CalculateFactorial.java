package com;

//Benjamin McBrayer, 4.26.2018
//This Java console program calculates the factorial of a number.

import java.util.Scanner;

public class CalculateFactorial {

	public static void main(String[] args) {
		// Declare and initialize variables.
		Scanner scnr = new Scanner(System.in);
		int userNum = 0;
		long f = 1;
		String userInfo = null;
		String playAgain = null;

		// Introduce the program.
		System.out.println("Welcome to the Factorial Calculator!");

		// Ask for user information.
		userInfo = Validator.getString(scnr, "Please enter your name: ");
		// Greet user.
		System.out.println("Hello, " + userInfo + "!");

		do {// Prompt user to enter an integer. Verify that 0 < userNum < 20.
			userNum = Validator.getInt(scnr, "Please enter a number between 1 and 20: ", 1, 20);
				
			// Calculate the factorial.
			f = factorial(userNum, f);
			System.out.println("The factorial of " + userNum + " is " + f + ".");
				
			// Ask if the user wants to continue entering numbers.
			playAgain = Validator.getString(scnr, userInfo + ", would you like to continue (y/n)?");

		} while (playAgain.equalsIgnoreCase("y"));

		// End the program officially.
		System.out.println("Goodbye, " + userInfo + "!");

		scnr.close();
	}

	/**
	 * @param userNum
	 * @param f
	 * @return the value of the factorial
	 */
	public static long factorial(int userNum, long f) {
		for (int i = 1; i <= userNum; ++i) {
			f *= i;
		}
		return f;
	}

}
