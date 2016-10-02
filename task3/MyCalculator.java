package com.company;

public class MyCalculator {

    static double add(double num1, double num2){
        return num1+num2;
    }
    static  double subtract(double num1, double num2){
        return num1-num2;
    }
    static double multiply(double num1, double num2){
        return num1*num2;
    }
    static double divide(double num1, double num2){
        if(Double.isNaN(num1/num2)||Double.isInfinite(num1/num2)) return 0;
        else return num1/num2;
    }
}
