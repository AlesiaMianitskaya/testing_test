package com.company;
//task1
public class Main {
  public static void main(String[] args) { //enter the argument from the command line
    for (int i = args.length - 1; i >= 0; i--) {//in reverse order
      System.out.println("Argument: " + i + args[i]); //result output
    }
  }
}
