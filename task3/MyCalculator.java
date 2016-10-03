package com.company;
/*class MyCalculator does all calculations.*/
public class MyCalculator {
  public int check(double num1, double num2) { //method check checks 0/0 and number/0
    if (Double.isNaN(num1 / num2)|| Double.isInfinite(num1 / num2))
      return 0;
    else return 1;
  }
  public double add(double num1, double num2) { //method add counts the sum
    return num1 + num2;
  }
  public double subtract(double num1, double num2) { //method subtract counts the rest
    return num1 - num2;
  }
  public double multiply(double num1, double num2) { ///method multiply counts the product
    return num1 * num2;
  }
  public double divide(double num1, double num2){ //method divide counts the quotients
      return num1 / num2;
  }
}
