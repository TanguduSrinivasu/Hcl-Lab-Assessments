package com.main;
import com.pojo.Ascii;
import java.util.Scanner;

public class AsciiMain
{
    public static void main(String args[])
    {     
        Scanner scanner=new Scanner(System.in);
         
        System.out.print("Enter a character: ");
        char character=scanner.next().charAt(0);
         
        int asciiValue= (int)character;
        System.out.println("The ASCII value of " + character + " is " + asciiValue);
        scanner.close();
         
    }
}