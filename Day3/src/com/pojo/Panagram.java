package com.pojo;

public class Panagram {
	public String Check(String string) {
		string = string.replaceAll("", "").toLowerCase();
		String s = "";
		for (char i = 'a'; i <= 'z'; i++) {
			if (string.indexOf(i) != -1) {
				s = s + i;
			}
		}
		if(s.length()==26){
			System.out.println("Pangram");
		}
		else{
			System.out.println(" Not Pangram");
		}
		return "";
	}
}
