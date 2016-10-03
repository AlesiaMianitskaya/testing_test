package com.company;
//class Main out puts in revers order
public class Main {
  public static void main(String[] args) { //enter the argument from the command line
    for (int i = args.length - 1; i >= 0; i--) {
      System.out.println("Argument: " + i + args[i]);
    }
  }
}
