package com.adeel.basic.Misc.IncrementDecrenentOperator;

public class PrePost_FunctionCall {
    public static void main(String[] args) {

        int n = 3;

        // POST-DECREMENT
        test(n--);  // passes 3 first, then n becomes 2
        System.out.println("After n-- call, n = " + n); // 2

        // here n is now 2
        // PRE-DECREMENT
        test(--n); // first n becomes 1, then passes 1
        System.out.println("After --n call, n = " + n); // 1
    }

    static void test(int x) {
        System.out.println("Received x = " + x); // 3
    }
}
