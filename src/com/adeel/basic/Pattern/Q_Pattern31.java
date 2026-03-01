package com.adeel.basic.Pattern;

public class Q_Pattern31 {
    public static void main(String[] args) {
        pattern31(4);
    }

    static void pattern31 (int n) {
        // Total size of the square = (2*n - 1)
        int size = 2 * n - 1;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {

                // Distance from all four borders
                int top    = row - 1;
                int left   = col - 1;
                int bottom = size - row;
                int right  = size - col;

                // Find the nearest border (layer index)
                int minDistance = Math.min(
                        Math.min(top, bottom),
                        Math.min(left, right)
                );

                // Reverse the layer to get required numbers
                int value = n - minDistance;

                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

}

/*
Pattern 31

         4 4 4 4 4 4 4
         4 3 3 3 3 3 4
         4 3 2 2 2 3 4
         4 3 2 1 2 3 4
         4 3 2 2 2 3 4
         4 3 3 3 3 3 4
         4 4 4 4 4 4 4
 */