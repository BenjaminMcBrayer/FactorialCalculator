package com;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author benjamin.mcbrayer
 *
 */
public class MyRecursionFactorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare and initialize variables.
		Scanner scnr = new Scanner(System.in);
		String userInfo = null;
		String playAgain = null;
		int userNum = 0;
		long f;

		// Introduce the program.
		System.out.println("Welcome to the Factorial Calculator!");

		// Ask for user information.
		userInfo = Validator.getString(scnr, "Please enter your name: ");
		// Greet user.
		System.out.println("Hello, " + userInfo + "!");

		do {
			// Prompt user to enter an integer.
			userNum = Validator.getInt(scnr, "Please enter a number between 1 and 20: ", 1, 20);

			// Calculate factorial.
			f = calcFactorial(userNum);
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
	 * @return the value of the factorial
	 */
	public static long calcFactorial(int userNum) {
		if (userNum == 0) {
			return 1;
		}
		return userNum * calcFactorial(userNum - 1);
	}
}
