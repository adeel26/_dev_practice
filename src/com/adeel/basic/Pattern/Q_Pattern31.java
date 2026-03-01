package com.adeel.basic.Pattern;

public class Q_Pattern31 {
    public static void main(String[] args) {
        pattern31(4);
    }

    static void pattern31 (int n) {
        // Total size of the square = (2*n - 1)
        int size = 2 * n - 1;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {

                // Distance from all four borders
                int top    = row;
                int left   = col;
                int bottom = size - 1 - row;
                int right  = size - 1 - col;

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