package com.pojo;

public class FirstLast {

	public static int checkCharacter(String string) 
    { 
		
		char[] ch = string.toCharArray();
        if (ch[0] == ch[string.length()-1])
        {
           return 1; 
        }
        else
        {
           return -1;
        }
    } 
}
