package com.adeel.Questions.Recursion.Level1;

// Sum of digits via recursion

public class Q_R_Lvl1_6 {
    public static void main(String[] args) {
        System.out.println(sumOfDigitsR(1345));
    }

    static int sumOfDigitsR (int num) {
        // Base case
        if (num == 0) {
            return 0;
        }
        // Recursive call
        return (num % 10) + sumOfDigitsR(num/10);
    }
}

/*
Normal Code:

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;  // get last digit
            num = num / 10;  // remove last digit
        }

        System.out.println("Sum: " + sum);
    }
}





🌳 Recursive Tree for sumDigits(1234)
sumDigits(1234)
= 4 + sumDigits(123)

    sumDigits(123)
    = 3 + sumDigits(12)

        sumDigits(12)
        = 2 + sumDigits(1)

            sumDigits(1)
            = 1 + sumDigits(0)

                sumDigits(0)
                = 0   ← base case


🔄 Now Backtracking (returning values)
sumDigits(0) = 0
sumDigits(1) = 1 + 0 = 1
sumDigits(12) = 2 + 1 = 3
sumDigits(123) = 3 + 3 = 6
sumDigits(1234) = 4 + 6 = 10


🧠 Key Understanding
Each call:
Breaks problem → last digit + smaller number
Tree goes down until base case (n == 0)
Then values are combined while coming back up


🔥 Pattern to remember
f(n) = last_digit + f(n / 10)
⚡ Interview Insight
If they ask “what is recursion tree here?”:
It’s a linear chain (not branching), because each call makes only one recursive call, so it’s more like a linked list structure, not a full tree.



 */