package com.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MismatchException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			try {
				System.out.println("Enter the integer one");
				int num1 = sc.nextInt();

				System.out.println("Enter the integer two");
				int num2 = sc.nextInt();

				System.out.println(+(num1 / num2));
			}

			catch (InputMismatchException e) {
				System.err.println("java.util.InputMismatchException");
			}

			catch (ArithmeticException e) {
				System.err.println("java.lang.ArithmeticException: / by zero");
			}

		}

		catch (Exception e) {
			System.out.println(e);
		}
		sc.close();

	}
}
