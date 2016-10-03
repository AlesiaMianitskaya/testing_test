package com.company;


public class Main {
  public static void main(String[] args) {
    MyCalculator calculator = new MyCalculator(); //create an object of the class MyCalculator
    System.out.println("Enter two numbers: ");
    double num1 = Double.parseDouble(args[0]);
    double num2 = Double.parseDouble(args[1]);

    System.out.println("Sum: " + calculator.add(num1, num2)); //method add counts the sum
    System.out.println("Rest: " + calculator.subtract(num1, num2)); //method subtract counts the rest
    System.out.println("Product: " + calculator.multiply(num1, num2)); //method multiply counts the product
    if (calculator.check(num1, num2) == 0) { //method divide counts the quotients
      System.out.println("Can't divide by zero!");
    }
    else {
      System.out.println("Quotients: " + calculator.divide(num1, num2));
    }
  }
}
