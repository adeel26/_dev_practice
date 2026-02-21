package com.adeel.Questions.Array;

import java.util.Arrays;
// 1929. Concatenation of Array
public class Q_Array2 {
    public static void main(String[] args) {
        int[] number = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation1(number)));
    }

    static int[] getConcatenation1(int[] nums) {
        int[] ans = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            ans[nums.length + i] = nums[i];
        }
        return ans;
    }

    static int[] getConcatenation2(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}
