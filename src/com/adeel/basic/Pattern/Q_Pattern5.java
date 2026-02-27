package com.adeel.basic.Pattern;

public class Q_Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2*n - 1; row++) {

            int totalStars = row <= n ? row : 2*n - row;

            for (int col = 1; col <= totalStars; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
/*
Pattern 5

    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *

 */