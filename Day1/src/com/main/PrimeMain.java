package com.main;
import com.pojo.Prime;
import java.util.Scanner;

public class PrimeMain {

    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");

        int num = scanner.nextInt();
        scanner.close();

        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (flag==false)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}