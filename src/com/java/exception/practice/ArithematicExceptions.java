package com.java.exception.practice;

/*
 * UnChecked->RunTimeException sub types.
 */

public class ArithematicExceptions {

	public static void checkException() {
		int a = 10 / 0;
	}

	public static void checkException2() {
		int b = 7 / 0;
	}

	public static void checkException3() {
		int c = 6 / 0;
	}

	public static void checkException4() {
		int d = 5 / 0;
	}

	public static void checkException5() {
		int e = 4 / 0;
	}

	public static void main(String[] args) {

		checkException();

		checkException2();

		checkException3();

		checkException4();

		checkException5();

	}
}