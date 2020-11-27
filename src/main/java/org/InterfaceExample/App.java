package org.InterfaceExample;

/**
 * Hello world!
 *
 */
public  class App implements Calculator
{
    public static void main( String[] args ) {


    App main = new App();
    main.Calculate();



    }

    @Override
    public int addition(int number1, int number2) {
        return number1 + number2;
    }

    @Override
    public int subtration(int number1, int number2) {
        if (number1 > number2){
            return number1 - number2;
        }
        return 0;
    }

    @Override
    public int division(int number1, int number2) {
        if (number1 > number2){
            return number1/ number2;
        }
        return 0;
    }

    @Override
    public int multiplication(int number1, int number2) {
        return number1 * number2;
    }
}
