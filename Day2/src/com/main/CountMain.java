package com.main;

import java.util.Scanner;

public class CountMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the word:");
		String word = scanner.nextLine();
		scanner.close();
		int vowels = 0;
		word = word.toLowerCase();
		System.out.println("The vowels in "+word +" is ");
		for (int i = 0; i < word.length(); ++i) {
			char ch = word.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
			{
				System.out.println(ch);
				vowels++;
			}
		}
		System.out.println("total number of vowels in "+word+" is " +vowels);
	}

}
