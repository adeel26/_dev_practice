package com.adeel.Questions.Basic;

public class ReverseNumber {
    public static void main(String[] args) {

        int num = 1234;
        int reversed = 0;

        while (num != 0) {
            int digits = num % 10;              // get last digit
            reversed = reversed * 10 + digits;  // build reversed number
            num = num / 10;                     // remove last digit
        }

        System.out.println("Reversed :" + reversed);
    }
}


/*

Example step-by-step (1234):
Start:
reversed = 0

Step 1:
digit = 4
reversed = 0 * 10 + 4 = 4

Step 2:
digit = 3
reversed = 4 * 10 + 3 = 43

Step 3:
digit = 2
reversed = 43 * 10 + 2 = 432

Step 4:
digit = 1
reversed = 432 * 10 + 1 = 4321


Key Idea
reversed * 10 → makes space for new digit
+ digit → adds the new digit at the end

We are building number from right → left
 */