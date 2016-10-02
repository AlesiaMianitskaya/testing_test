package com.company;
public class MyCalculator {
  private double check(double num1, double num2) { //method check checks 0/0 and number/0
    if (Double.isNaN(num1 / num2)|| Double.isInfinite(num1 / num2))
      return 0;
    else return 1;
  }
  double add(double num1, double num2) { //method add counts the sum
    return num1 + num2;
  }
  double subtract(double num1, double num2) { //method subtract counts the rest
    return num1 - num2;
  }
  double multiply(double num1, double num2) { ///method multiply counts the product
    return num1 * num2;
  }
  double divide(double num1, double num2){ //method divide counts the quotients
    if (check(num1, num2) == 1)
      return num1 / num2;
    else return 0;
  }
}
