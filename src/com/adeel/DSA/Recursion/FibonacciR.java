package com.adeel.DSA.Recursion;

public class FibonacciR {
    public static void main(String[] args) {
        int ans = fibonacciR(6);
        System.out.println(ans);
    }

    public static int fibonacciR(int n) {

        // Base condition
        if(n < 2) {
            return n;
        }

        return fibonacciR(n - 1) + fibonacciR(n - 2);
    }
}
