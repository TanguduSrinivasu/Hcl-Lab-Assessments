package com.pojo;

public class LowerCase {
	private String string;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public String convert(String string) {
		this.string = string;
		string = string.toLowerCase();
		System.out.println("After conversion to Lower Case :" + string);
		return "";
	}
}
