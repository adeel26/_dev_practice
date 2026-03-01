package com.adeel.basic.Pattern;

public class Q_Pattern17 {
    public static void main(String[] args) {
        pattern17(4);
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2*n - 1; row++) {

            int c = row <= n ? row : 2*n - row;

            for (int s = 1; s <= n-c; s++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}

/*
Pattern 17

         1
        212
       32123
      4321234
       32123
        212
         1

 */