package com.main;
import com.pojo.Average;
import java.util.Scanner;

public class AverageMain {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter first number:");
	        int num1 = scanner.nextInt();
	        System.out.print("Enter second number:");
	        int num2 = scanner.nextInt();
	        System.out.print("Enter third number:");
	        int num3 = scanner.nextInt();
	        scanner.close();
	        int avg = ((num1+num2+num3)/3);
	        System.out.println("The average of three numbers is "+avg);
	        

	}

}
