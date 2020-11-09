package com.pojo;

public class Palindrome {
	public String palindrome(String string) {
		String reverse = new StringBuffer(string).reverse().toString();
		if (string.equals(reverse)) {
			System.out.println("Yes");
		}

		else {
			System.out.println("No");
		}
		return "";
	}
}
