package com.main;

import java.util.Scanner;

import com.pojo.MyCalculator;

public class MyCalculatorMain {
	static void isValid(int number1, int number2) throws Exception {
		if (number1 == 0 && number2 < 0)
			throw new Exception(" n and p should not be zero");
		else if (number1 < 0 || number2 < 0)
			throw new Exception(" n and p should not be negative");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number one");
		int number1 = scanner.nextInt();
		System.out.println("Enter number two");
		int number2 = scanner.nextInt();
		try {
			isValid(number1, number2);
			System.out.println(+number1 + " Power of " + number2 + " is " + MyCalculator.power(number1, number2));
		} catch (Exception e) {
			System.err.println(e);
		}
		scanner.close();
	}

}
