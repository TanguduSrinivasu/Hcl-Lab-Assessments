package com.main;
import com.pojo.Swap;
import java.util.Scanner;

public class SwapMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");

        int num1 = scanner.nextInt();
        System.out.print("Enter second number:");
        int num2 = scanner.nextInt();
        scanner.close();
        int swap = 0;
        swap = num1;
        num1 = num2;
        num2 = swap;
        System.out.println("After swapping the first number is "+num1+ " and "+"second number is "+num2);

	}

}
