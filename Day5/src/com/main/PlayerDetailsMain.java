package com.main;

import java.util.Scanner;

import com.pojo.CustomException;
import com.pojo.PlayerDetails;
import com.service.PlayerValidate;

public class PlayerDetailsMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the player ");
		String name = scanner.nextLine();
		System.out.println("Enter the age of player");
		int age = scanner.nextInt();
		try {
			PlayerValidate.isValidAge(age);
			PlayerDetails playerdetails = new PlayerDetails(name, age);
			System.out.println("Player name is : " + playerdetails.getName());
			System.out.println("Player age is  : " + playerdetails.getAge());
		} catch (CustomException e) {
			System.err.println(e);
		}
		scanner.close();
	}
}
