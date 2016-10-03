package com.company;
/*
 *class Main prints arguments in reversed order
 *
 */
public class Main {
  /*
   enter the argument from the command line, prints arguments in reversed order
   */
  public static void main(String[] args) {
    for (int i = args.length - 1; i >= 0; i--) {
      System.out.println("Argument: " + i + args[i]);
    }
  }
}
