package com.company;
import java.util.Scanner;
public class Calculator_in_java {
    public static void main(String[] args) {
        System.out.println("Simple Calculator");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        float num1 = sc.nextFloat();
        System.out.println("Enter the second number");
        float num2 = sc.nextFloat();

        System.out.println("Enter an Operator (+, -, *, /) : ");
        char op = sc.next().charAt(0);

        float result;
        switch(op) {
            case '+' : result = num1 + num2;
            break;

            case '-' : result = num1 - num2;
            break;

            case '*' : result = num1 * num2;
            break;

            case '/' : result = num1 / num2;
            break;

            default :
                System.out.println("Error! Enter correct operator ");
                return;
        }
        System.out.println("Result are : " );
        System.out.println(num1 + " " + op + " " + num2 + " = " + result);

    }
}
