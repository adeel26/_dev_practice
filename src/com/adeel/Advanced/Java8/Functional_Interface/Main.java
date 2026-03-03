package com.adeel.Advanced.Java8.Functional_Interface;

public class Main {
    public static void main(String[] args) {

        // Functional Interface =   Interface having exactly single abstract method but can have any number
        //                          of defaults and static methods. We can invoke lambda expression by
        //                          using functional interface.


        // Use a lambda expression to provide an implementation for the abstract method 'operate'
        Calculator add = (a, b) -> a + b;

        /*
            So internally, it behaves like this old-style code:

            Calculator adder = new Calculator() {
                @Override
                public int operate(int a, int b) {
                    return a + b;
                }
             };
*/


        int num1 = 10;
        int num2 = 20;

        // Call the abstract method via the functional interface instance
        int sum = add.operate(num1, num2);

        // Call the abstract method via the functional interface instance
        add.printOperation(num1, num2, sum);

        // Call the static method directly using the interface name
        Calculator.displayCalcType();

    }
}





/*
What is the advantage of this (@FunctionalInterface) annotation ?
It restricts the interface to be a Functional Interface.
So if people have already used some lambda expression and some new team member added another
abstract method in the interface, all lambda expression will have errors.
 */