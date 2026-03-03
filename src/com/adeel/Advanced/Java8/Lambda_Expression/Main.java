package com.adeel.Advanced.Java8.Lambda_Expression;


public class Main {

    /*
        A Lambda Expression is a short way to write an anonymous function.
        Instead of writing full method or anonymous class, you write compact function-like syntax.

        (parameters) -> expression

         or

         (parameters) -> {
            // multiple statements
         }

        Steps to make any function lambda expression
        1.  Remove modifier
        2.  Remove return type
        3.  Remove method name
        4.  Place arrow

        Example 1.
        private void sayHello() {
            System.out.println("Hello !");
        }

        () -> {System.out.println("Hello World !");}


        Example 2.
        private void add(int a, int b) {
            System.out.println(a + b);
        }

        (int a, int b) -> {System.out.println(a + b);}


        Example 3.
        private int getStringLength(String str){
            return str.length();
        }

        (String str) -> {return str.length();}

     */

    // ----------------------------------------------------------------------------

    /*
        Characteristics / properties of lambda expression

        1. If body has just one statement then we can remove curly brackets.
        2. Use type inference, compiler guess the situation or context.

            private void add(int a, int b){
                System.out.println(a + b);
            }

            converted to

            (int a, int b) -> {System.out.println(a + b);}

            converted to

            (a, b) -> System.out.println(a + b);

        3. No return keyword

            private int getStringLength(String str) {
                return str.length();
            }

            converted to

            (String str) -> {return str.length();}

            converted to

            (str) -> str.length();

         4. If only one parameter, remove small brackets

             (str) -> str.length();

             converted to

             str -> str.length();


     */

    /*
        Benefits of Lambda expression
        1. To enable functional programing in java
        2. To make code more readable
        3. To enable parallel processing
        4. JAR file size reduction
        5. Elimination of shadow variables

     */




}
