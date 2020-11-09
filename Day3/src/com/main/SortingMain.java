package com.main;

import java.util.Scanner;

import com.pojo.Sorting;

public class SortingMain {

	public static void main(String[] args) {
		int[] integers = new int[10];
		System.out.println("Enter the 10 integers");
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			integers[i] = scanner.nextInt();
			scanner.nextLine();
		}
		System.out.println("After sorting in Ascending order");
		Sorting.sorting(integers);
		for (int i = 0; i < 10; i++) {
			System.out.println(integers[i]);
		}
		scanner.close();

	}

}
