package com.main;
import java.io.FileWriter;
import java.io.PrintWriter;
public class AppendFileMain {
	   public static void main( String[] args ) {

		  
		       String textToAppend = " Appended Text";
		       try{ 
		       FileWriter fileWriter = new FileWriter("D:\\AppendedFile.txt", true); 
		       PrintWriter printWriter = new PrintWriter(fileWriter);
		       printWriter.println(textToAppend);  //New line
		       printWriter.close();
		       System.out.println("Success");
		       }
		       catch(Exception e)
		       {
		    	System.out.println("Something wrong");   
		       }
		   
	   }
	}