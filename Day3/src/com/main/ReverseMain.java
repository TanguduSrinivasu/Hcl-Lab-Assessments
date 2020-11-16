package com.main;

import java.util.Scanner;

import com.pojo.Reverse;

public class ReverseMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String string = scanner.nextLine();
		System.out.println("Enter the character ");
		char character = scanner.next().charAt(0);
		System.out.println("The final String is :" + Reverse.ReShape(string, character));
		scanner.close();

	}

}
