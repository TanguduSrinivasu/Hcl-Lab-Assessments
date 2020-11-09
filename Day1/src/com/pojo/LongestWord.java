package com.pojo;

public class LongestWord {
	
	public static String getLargestWord(String word)
	{
		String[] splits = word.split(" ");
		int large=0;
		String longString=" ";
		
		for(String string : splits)
		{
			int length = string.length();
			if(large < length )
			{
				large=length;
				longString=string;
			}
		}
		return longString;
		
	}

}
