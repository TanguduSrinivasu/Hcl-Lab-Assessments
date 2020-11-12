package com.main;

import java.util.Calendar;

public class DateTime {
	public static void main(String[] args) {
		Calendar calender = Calendar.getInstance();
		System.out.println("Current Date and Time :");
		System.out.format("%tB %te, %tY%n", calender, calender, calender);
		System.out.format("%tl:%tM %tp%n", calender, calender, calender);
	}

}
