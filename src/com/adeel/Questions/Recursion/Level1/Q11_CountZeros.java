package com.adeel.Questions.Recursion.Level1;

public class Q11_CountZeros {
    public static void main(String[] args) {
        System.out.println(count(100230));
    }

    static int count(int num) {
        if(num == 0) {
            return 1;
        }

        return helper(num, 0);
    }

    private static int helper(int num, int count) {
        if (num == 0) {
            return count;
        }

        int digit = num % 10;
        if(digit == 0) {
            return helper(num/10, count+1);
        }
        return helper(num/10, count);
    }

}
