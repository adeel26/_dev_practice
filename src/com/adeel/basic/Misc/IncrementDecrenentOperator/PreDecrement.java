package com.adeel.basic.Misc.IncrementDecrenentOperator;

// Pre-Decrement (--n)
// Decrease first, then use
public class PreDecrement {
    public static void main(String[] args) {

        int n = 5;

        // --n → decrease first, then use
        int x = --n;

        System.out.println("x = " + x); // 4 (new value used)
        System.out.println("n = " + n); // 4
    }
}
