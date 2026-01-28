package com.adeel.Questions.BinarySearch;
// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class Q_BinarySearch6v1 {
    public static void main(String[] args) {
        int[] arr = {0,1,0};

        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]) {
                // we are in descending part of array
                // this may be the answer but look at left
                // this is why end != mid - 1
                end = mid;
            }
            else if (arr[mid] < arr[mid + 1]) {
                // we are in ascending part of array
                start = mid + 1;
                // because we know that mid+1 element > mid element
            }
        }
        return start;
    }

}
