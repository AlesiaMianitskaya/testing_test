package com.company;

public class Main {

    public static void main(String[] args) {  //enter the argument from the command line
	for(int i = args.length-1; i>=0; i--){
        System.out.println("Аргумент: "+ i + args[i]);
    }
    }
}
