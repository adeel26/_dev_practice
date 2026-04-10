package com.adeel.Questions.Basic;

public class CountZeros {
    public static void main(String[] args) {
        int num = 20403;

        System.out.println(countZeros(num));
    }

    public static int countZeros(int num) {
        int count = 0;

        // edge case
        if (num == 0) {
            return 1;
        }

        while(num > 0) {
            int digit = num % 10;
            if(digit == 0) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }
}
