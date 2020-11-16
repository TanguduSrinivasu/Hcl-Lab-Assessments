package com.pojo;

public class Reverse {
	
public static String ReShape(String string, char ch)
{
	String result = "";
	for(int i=string.length() - 1;i>=0;i--)
	{
		result += string.charAt(i);
		if(i!=0)
		{
			result += ch;
			
		}
	}
	return result;
}
}