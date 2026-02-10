package com.adeel.basic.BinarySearch2DArrays;

import java.util.Arrays;

public class RowColumMatrix {
    public static void main(String[] args) {
        // Row wise sorted & Column wise sorted Array
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        System.out.println(Arrays.toString(search(arr, 37)));
    }

    static int[] search(int[][] matrix, int target){
        int i =0;
        int j = matrix[0].length - 1; // Last Column

        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                return new int[]{i,j};
            }
            if (matrix[i][j] < target) {
                i++;
            }
            else if (matrix[i][j] > target) {
                j--;
            }
        }
        return new int[]{-1,-1};
    }

}
