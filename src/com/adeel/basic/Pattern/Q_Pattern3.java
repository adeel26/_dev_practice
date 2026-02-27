package com.adeel.basic.Pattern;

public class Q_Pattern3 {
    public static void main(String[] args) {
        pattern3a(5);
        pattern3b(5);
    }

    static void pattern3a(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3b(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n+1-row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
Patter 3

    *****
    ****
    ***
    **
    *

 */