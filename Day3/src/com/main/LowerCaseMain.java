package com.main;

import java.util.Scanner;

import com.pojo.LowerCase;

public class LowerCaseMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string in Upper Case");
		String string = scanner.nextLine();
		scanner.close();
		LowerCase lowercase = new LowerCase();
		lowercase.convert(string);

	}

}
