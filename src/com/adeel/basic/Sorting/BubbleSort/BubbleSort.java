package com.adeel.basic.Sorting.BubbleSort;
// Bubble Sort // Sinking Sort // Exchange Sort

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void bubbleSort(int[] nums) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < nums.length - i; j++) {
                // swap if the item is smaller than previous item
                if(nums[j] < nums[j-1]) {
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means
            // !swapped means swapped == false
            if(swapped == false){
                break;
            }
        }




    }

}

/*

Bubble Sort (simple explanation)
Idea:
Compare adjacent elements and swap if they are in the wrong order.
After each pass, the largest element “bubbles” to the end.

How it works (example)
Array:
[5, 3, 8, 4]

Pass 1:
5 > 3 → swap → [3, 5, 8, 4]
5 < 8 → no swap
8 > 4 → swap → [3, 5, 4, 8]
👉 8 is now fixed at the end

Pass 2:
3 < 5 → no swap
5 > 4 → swap → [3, 4, 5, 8]
👉 5 is fixed

Pass 3:
3 < 4 → no swap
Done ✅


public class BubbleSort {

    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps happened, array is already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4};
        bubbleSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

 */