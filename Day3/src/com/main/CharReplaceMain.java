package com.main;

import java.util.Scanner;

import com.pojo.CharReplace;

public class CharReplaceMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String string = scanner.nextLine();
		scanner.close();
		CharReplace charreplace = new CharReplace();
		charreplace.replace(string);

	}
}
