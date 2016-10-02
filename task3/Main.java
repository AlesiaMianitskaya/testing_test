package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double num1=sc.nextDouble();                    //num1 first number
        double num2=sc.nextDouble();                    //num2 second number
        
        System.out.println("Sum: "+ calculator.add(num1,num2));
        System.out.println("Rest: "+ calculator.subtract(num1,num2));
        System.out.println("Product: "+ calculator.multiply(num1,num2));
        if(calculator.divide(num1,num2)==0)  System.out.println("Can't divide by zero!");
        else System.out.println("Quotients: "+ calculator.divide(num1,num2));
    }
}
