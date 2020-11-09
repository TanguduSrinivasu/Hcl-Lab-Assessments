package com.pojo;

public class CharReplace {
	private String string;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public String replace(String string) {
		this.string = string;
		string = string.toLowerCase();
		String replaced_string = string.replace('d', 'h');
		System.out.println("Given String : " + string);
		System.out.println("After replacing, String is  : " + replaced_string);
		return "";
	}
}
