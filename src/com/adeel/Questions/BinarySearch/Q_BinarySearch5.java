package com.adeel.Questions.BinarySearch;
// Find position of an element in a sorted array of infinite numbers
// https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/

public class Q_BinarySearch5 {
    public static void main(String[] args) {

        // suppose arr to be infinite array
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 14, 18, 20, 22, 23, 25, 27, 31, 51};
        int target = 25;

        System.out.println(ans(arr,target));

    }

    static int ans(int[] arr, int target) {
        // first find the range
        // fist start with a box of size 2
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeOfBox * 2
            // “I subtracted the start, so I must add it back as one element. (end - start + 1)”
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

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


}
