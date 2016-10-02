package com.company;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    MyCalculator calculator = new MyCalculator(); //create an object of the class MyCalculator
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    double num1 = sc.nextDouble(); //num1 first number
    double num2 = sc.nextDouble(); //num2 second number

    System.out.println("Sum: " + calculator.add(num1, num2)); //method add counts the sum
    System.out.println("Rest: " + calculator.subtract(num1, num2)); //method subtract counts the rest
    System.out.println("Product: " + calculator.multiply(num1, num2)); //method multiply counts the product
    if (calculator.divide(num1, num2) == 0) { //method divide counts the quotients
      System.out.println("Can't divide by zero!");
    }
    else {
      System.out.println("Quotients: " + calculator.divide(num1, num2));
    }
  }
}
