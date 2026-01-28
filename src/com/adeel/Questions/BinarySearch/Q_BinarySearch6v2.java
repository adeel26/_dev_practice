package com.adeel.Questions.BinarySearch;
// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class Q_BinarySearch6v2 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,5,6,8,7,3,2,1};

        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        // Optimization to avoid edge cases
        // Setting start at 1 and end at second last element as in mountain array, they won't be peak element
        int start = 1;
        int end = arr.length - 2;

        while (start <= end ) {
            int mid = start + (end - start) / 2;

            if (arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]) {
                return arr[mid];
            }
            else if (arr[mid-1] < arr[mid]) { // increasing slop so answer will be in right
                start = mid + 1;
            }
            else if (arr[mid] > arr[mid+1]) { // decreasing slop so answer will be in left
                end = mid - 1;
            }
        }
        return -1;
    }


}
