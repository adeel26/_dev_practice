package com.adeel.Questions.Basic;

// Sum of digits
public class SumOfDigits {
    public static void main(String[] args) {
        int num = 1345;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10; // get last digit
            sum += rem;
            num = num / 10; // remove last digit
        }

        System.out.println("Sum: " + sum);
    }
}
