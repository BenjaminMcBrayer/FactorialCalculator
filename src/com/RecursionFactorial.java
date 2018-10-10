package com;

public class RecursionFactorial {

	int myVar;

	public static void main(String[] args) {
		int num = 1;
		long result;
		result = calcFactorial(num);

		System.out.println("Result = " + result);
	}

	// Factorial recursion.
	public static long calcFactorial(int num) {
		if (num == 0) {
			return 1;
		}
		return num * calcFactorial(num - 1);
	}
}
