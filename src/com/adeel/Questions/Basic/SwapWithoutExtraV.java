package com.adeel.Questions.Basic;

public class SwapWithoutExtraV {
    public static void main(String[] args) {
        swap(10, 20);
    }

    public static void swap(int a, int b) {
        System.out.println("Before swap: a = " + a + " b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap: a = " + a + " b = " + b);
    }

}

/*
Can cause integer overflow if numbers are large

Using XOR (Best Approach)
 */