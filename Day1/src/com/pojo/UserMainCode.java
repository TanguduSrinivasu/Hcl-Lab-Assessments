package com.pojo;

import java.util.Scanner;
public class UserMainCode {
	public static int sumOfSquaresOfEvenDigits(int number) {
		int sum=0;
		int remainder = 0;
		while (number != 0) {
			remainder = number % 10;
			if ((remainder % 2) == 0) {
				sum = sum + (remainder * remainder);
							}
			number /= 10;	
		}
		return sum;
	}
	
}



