package com.main;

import com.pojo.OddSum;
import java.util.Scanner;

public class OddSumMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int number = scanner.nextInt();
		scanner.close();
		if (OddSum.checkSum(number) == 1) {
			System.out.println("Sum is Odd");
		} else if (OddSum.checkSum(number) == -1) {
			System.out.println("Sum is even");
		}
	}

}
