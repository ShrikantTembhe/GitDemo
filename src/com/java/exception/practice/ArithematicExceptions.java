package com.java.exception.practice;

/*
 * UnChecked->RunTimeException sub types.
 */

public class ArithematicExceptions {

	public static void checkException() {
		int a = 10 / 0;
	}

	public static void checkException4() {
		int d = 5 / 0;
	}

	public static void checkException5() {
		int e = 4 / 0;
	}

	public static void checkException6() {
		int z = 5 / 0;
	}

	public static void main(String[] args) {

		checkException();

		checkException4();

		checkException5();

		checkException6();

	}
}