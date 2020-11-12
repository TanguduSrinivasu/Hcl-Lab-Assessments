package com.main;

import java.text.ParseException;
import java.util.Scanner;
import com.pojo.DateDifference;
public class DateDifferenceMain {

	public static void main(String[] args) throws ParseException{
		 
			System.out.println("Enter the first date in the format  (yyyy-mm-dd)");
			Scanner scanner = new Scanner(System.in);
			String string1 = scanner.nextLine();
			System.out.println("Enter the second date in the format  (yyyy-mm-dd)");
			String string2 = scanner.nextLine();
			DateDifference d = new DateDifference();
	        System.out.println("Difference between dates is "+d.dateDifference(string1,string2));
	        scanner.close();
	}

}
