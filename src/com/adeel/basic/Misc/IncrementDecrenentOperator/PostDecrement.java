package com.adeel.basic.Misc.IncrementDecrenentOperator;

// Post-Decrement (n--)
public class PostDecrement {
    public static void main(String[] args) {

        int n = 5;

        // n-- → use value first, then decrease
        int x = n--;

        System.out.println("x = " + x); // 5 (old value used)
        System.out.println("n = " + n); // 4 (then decreased)
    }
}
