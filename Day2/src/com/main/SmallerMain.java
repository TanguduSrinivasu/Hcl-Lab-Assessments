package com.main;
import com.pojo.Smaller;
import java.util.Scanner;

public class SmallerMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number:");
		int num1 = scanner.nextInt();
		System.out.print("Enter second number:");
		int num2 = scanner.nextInt();
		System.out.print("Enter third number:");
		int num3 = scanner.nextInt();
		scanner.close();
		if ((num1 < num2) && (num1 < num3)) {
			System.out.println("num1 is smaller");
		} else if ((num2 < num1) && (num2 < num3)) {
			System.out.println("num2 is smalleer");
		} else if ((num3 < num1) && (num3 < num2)) {
			System.out.println("num3 is smaller");
		}

	}

}
