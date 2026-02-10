package com.adeel.basic.BinarySearch2DArrays;
// Doing via true binary search.
// This can also be done with RowColumnMatrix solution
import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        System.out.println(Arrays.toString(search1(arr, 16)));
        System.out.println(Arrays.toString(search2(arr, 15)));
        System.out.println(Arrays.toString(search3(arr, 9)));
    }


    /* **************************************************************************************************** */
    // First solution, normal approach
    static int[] search1(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length-1;

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
    /* **************************************************************************************************** */


    /* **************************************************************************************************** */
    // Second Solution, Using Binary Search approach
    static int[] search2(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {

            // Boundary check: only search row if target could be in it
            if(target >= matrix[i][0] && target <= matrix[i][matrix[i].length - 1]){
                int start = 0;
                int end = matrix[i].length-1;

                while (start <= end) {
                    int mid = start + (end - start)/2;

                    if(matrix[i][mid] == target){
                        return new int[]{i, mid};
                    }
                    else if(matrix[i][mid] < target){
                        start = mid + 1;
                    }
                    else  if(matrix[i][mid] > target){
                        end = mid - 1;
                    }
                }

            }


        }

        return new int[]{-1,-1};
    }
    /* **************************************************************************************************** */


    /* **************************************************************************************************** */
    // Third Solution, Using Binary Search function of normal array
    static int[] search3(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            // Boundary check: only search row if target could be in it
            if (target >= matrix[i][0] && target <= matrix[i][matrix[i].length - 1]) {
                int j = binarySearch(matrix[i], target);
                if(j != -1){
                    return new int[]{i, j}; // found
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int binarySearch (int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find middle element start + end / 2
            // safe way to find mid to avoid overflow
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target == arr[mid]){
                // it can be without condition as its only condition left
                return mid;
            }
        }
        return -1;
    }
    /* **************************************************************************************************** */


    /* **************************************************************************************************** */



    /* **************************************************************************************************** */

}
