package com.main;

import java.util.Scanner;
public class FizzBuzzMain {
    public static void main(String args[]) {
      
      Scanner SC=new Scanner(System.in);
         
        
        
        for(int i=1;i<=100;i++)
        {
            if(i%3==0)
            {
                System.out.println(i+" : fizz");
            }
            else if (i%5==0)
            {
                System.out.println(i+" : fizz");
            }
            else if (i%3==0 && i%5==0)
            {
                System.out.println(i+" : fizz buzz");
            }
        }
    }
}