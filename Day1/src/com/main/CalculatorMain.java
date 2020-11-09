package com.main;
import com.pojo.Calculator;
import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {

    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");

        int num1 = scanner.nextInt();
        System.out.print("Enter second number:");
        int num2 = scanner.nextInt();

        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        int output;

        switch(operator)
        {
            case '+':
            	output = num1 + num2;
            	System.out.println("Additon of "+num1+" and "+num2+" are " +output);
                break;

            case '-':
            	output = num1 - num2;
            	System.out.println("Subtraction of "+num1+" and "+num2+" are " +output);
                break;

            case '*':
            	output = num1 * num2;
            	System.out.println("Multplication of "+num1+" and "+num2+" are " +output);
                break;

            case '/':
            	output = num1 / num2;
            	System.out.println("Division of "+num1+" and "+num2+" are " +output);
                break;
                
            case '%':
            	output = num1 % num2;
            	System.out.println("remainder of "+num1+" and "+num2+" are " +output);
                break;
                
            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

            }
}

