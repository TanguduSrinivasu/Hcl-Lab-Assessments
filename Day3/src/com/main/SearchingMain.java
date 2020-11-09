package com.main;

import java.util.Scanner;

import com.pojo.Searching;

public class SearchingMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 10 integers");
		int[] integers = new int[10];
		for (int i = 0; i < 10; i++) {
			integers[i] = scanner.nextInt();
			scanner.nextLine();
		}
		System.out.println("Enter an Element for search");
		int search = scanner.nextInt();
		int position = Searching.search(integers, search);
		if (position == -1) {
			System.out.println("Element was not in the given array");
		} else {
			System.out.println(" Required element is present at: " + position);
		}
		scanner.close();
	}

}
