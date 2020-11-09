package com.main;

import java.util.Scanner;

public class MiddleMain 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String string = scanner.nextLine();
		
		
		int position;
		int length;
		if (string.length() % 2 == 0)
		{
			position = string.length() / 2 - 1;
			length = 2;
		}
		else 
		{
			position = string.length() / 2;
			length = 1;
		}
		String resultantString = string.substring(position, position + length);
		System.out.println("The middle character in the given  string is: " + resultantString);
		scanner.close();
	}
	
}