package com.adeel.basic.Pattern;

public class Q_Pattern6 {
    public static void main(String[] args) {
        pattern6(5);
    }

    static void pattern6(int n) {
        for (int i = 1; i <= n ; i++) {

            // print spaces
            for (int j = 1; j <= n - i ; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int K = 1; K <= i; K++) {
                System.out.print("*");
            }

            System.out.println();

        }


    }
}

/*

         *
        **
       ***
      ****
     *****

 */
