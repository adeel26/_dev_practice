package com.adeel.Questions.Basic;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;
        // Call the method and print result
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }

    // Method to find nth Fibonacci number
    public static int fibonacci(int n) {

        // Base case: if n is 0 or 1, return n itself
        if(n <= 1) {
            return n;
        }

        // Initialize first two Fibonacci numbers
        int a = 0;  // F(0)
        int b = 1;  // F(1)

        // Loop starts from 2 because 0 and 1 are already known
        for (int i = 2; i <= n; i++) {

            // Calculate next Fibonacci number
            int c = a + b;

            // Move values forward:
            // 'a' becomes previous 'b'
            a = b;

            // 'b' becomes current Fibonacci number (c)
            b = c;
        }

        // At the end, 'b' holds the nth Fibonacci number
        return b;
    }

}
