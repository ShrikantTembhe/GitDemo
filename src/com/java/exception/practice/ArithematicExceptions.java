package com.java.exception.practice;

/*
 * UnChecked->RunTimeException sub types.
 */

public class ArithematicExceptions {

	public static void checkException() {
		int a = 10 / 0;
	}

	public static void checkException2() {
		int a = 7 / 0;
	}

	public static void checkException3() {
		int a = 6 / 0;
	}

	public static void checkException4() {
		int a = 5 / 0;
	}

	public static void checkException5() {
		int a = 4 / 0;
	}

	public static void main(String[] args) {

		checkException();

		checkException2();

		checkException3();

		checkException4();

		checkException5();

	}
}