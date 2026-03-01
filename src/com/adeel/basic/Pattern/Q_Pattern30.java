package com.adeel.basic.Pattern;

public class Q_Pattern30 {
    public static void main(String[] args) {
        pattern30(5);
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {

            for (int s = 1; s <= n-row; s++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}

/*
Pattern 30

            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5

 */