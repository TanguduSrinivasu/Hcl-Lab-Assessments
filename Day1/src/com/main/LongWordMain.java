package com.main;
import java.util.Scanner;

import com.pojo.LongestWord;
public class LongWordMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the String");
		String word = scanner.nextLine();
		scanner.close();
		System.out.println("The longest word in the given string is: "+LongestWord.getLargestWord(word));
	}

}
