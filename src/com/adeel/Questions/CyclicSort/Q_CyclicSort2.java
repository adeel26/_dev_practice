package com.adeel.Questions.CyclicSort;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/


import java.util.ArrayList;
import java.util.List;

public class Q_CyclicSort2 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else {
                i++;
            }
        }

        // just find missing numbers
        List<Integer> answer = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j +1){
                answer.add(j+1);
            }
        }
        return answer;
    }


    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
