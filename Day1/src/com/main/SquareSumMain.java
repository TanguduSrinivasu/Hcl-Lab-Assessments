package com.main;

import java.util.Scanner;

import com.pojo.UserMainCode;

public class SquareSumMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int number = scanner.nextInt();
		scanner.close();
		System.out.println("sum of squares of given number is " + UserMainCode.sumOfSquaresOfEvenDigits(number));

	}

}