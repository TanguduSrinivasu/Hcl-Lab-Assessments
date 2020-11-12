package com.main;

import java.util.*;
import java.text.*;

public class ExtractDateTime {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String containing a date  (yyyy-mm-dd) and time (HH:mm:ss) in this format only");
		String date = scanner.nextLine();

		try {

			Date sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date);
			String StandardDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(sdf);
			System.out.println("The date and time  is " + StandardDate + " (dd/mm/yyyy) (HH:mm:ss)");
		} catch (Exception e) {
			System.out.println("Exception occured " + e);
		}
		scanner.close();

	}

}
