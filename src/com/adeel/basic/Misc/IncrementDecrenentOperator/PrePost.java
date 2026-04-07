package com.adeel.basic.Misc.IncrementDecrenentOperator;

// Side-by-side comparison
public class PrePost {
    public static void main(String[] args) {

        int a = 5;
        int b = 5;

        int x = a--; // post
        int y = --b; // pre

        System.out.println("a = " + a); // 4
        System.out.println("x = " + x); // 5

        System.out.println("b = " + b); // 4
        System.out.println("y = " + y); // 4

    }
}
