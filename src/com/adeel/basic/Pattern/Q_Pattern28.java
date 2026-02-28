package com.adeel.basic.Pattern;

public class Q_Pattern28 {
    public static void main(String[] args) {
        pattern28(5);
    }

    static void pattern28(int n) {
        for (int row = 1; row <= 2*n - 1; row++) {

            int totalColsInRows = row <= n ? row : 2*n - row;
            int noOfSpaces = n - totalColsInRows;
            for (int s = 1; s <= noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalColsInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
/*
Pattern 28

         *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *

 */
