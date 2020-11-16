package com.main;

import java.util.Scanner;

import com.pojo.Palindrome;
import com.pojo.Panagram;

public class PanagramMain {
	public static void main(String args[])
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter Your String:");
		String string=scanner.nextLine();
		scanner.close();
		Panagram panagram = new Panagram();
		panagram.Check(string);
		
}
}