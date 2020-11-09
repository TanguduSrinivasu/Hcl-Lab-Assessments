package com.pojo;

import com.main.OddSumMain;

public class OddSum {
	public static int checkSum(int number) {
		int sum = 0;
		while (number > 0) {
			int remainder = number % 10;
			if (remainder % 2 != 0) {
				sum = sum + remainder;
			}
			number = number / 10;
		}

		if (sum % 2 == 1) {
			return 1;
		} else {
			return -1;
		}

	}
}
