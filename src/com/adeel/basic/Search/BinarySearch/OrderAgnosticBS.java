package com.adeel.basic.Search.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9, 11, 13};
        int[] arr2 = {13, 11, 10, 8, 7, 4, 2, 1};
        int target = 7;

        System.out.println(orderAgnosticBS(arr2, target));
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else if(target < arr[mid]){
                    end = mid - 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else if(target < arr[mid]){
                    start = mid + 1;
                }

            }


        }
        return -1;

    }
}
