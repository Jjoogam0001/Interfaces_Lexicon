package org.InterfaceExample;

import java.util.Scanner;

public interface Calculator {

  int addition( int number1 , int number2);
  int subtration(int number1 , int number2);
  int division(int number1 , int number2);
  int multiplication(int number1 , int number2);
  Scanner input = new Scanner(System.in);

    static int userInput1(){

        return input.nextInt();
    }

    static int userInput2(){

        return input.nextInt();
    }
    default void Calculate(){
        System.out.println("-----Menu-----");
        System.out.println("(1) Addition");
        System.out.println("(2) Multiplication");
        System.out.println("(3) Division");
        System.out.println("(4) Subtraction");
        int choice =0;
        choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println(addition(userInput1(),userInput2()));    ;

                break;
            case 2:
                System.out.println(multiplication(userInput1(),userInput2()));
                break;
            case 3:
                System.out.println(division(userInput1(),userInput2()));
              ;
                break;
            case 4:
                System.out.println(subtration(userInput1(),userInput2()));

                break;
        }

    }




}
