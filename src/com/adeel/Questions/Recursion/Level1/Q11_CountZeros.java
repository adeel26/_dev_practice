package com.adeel.Questions.Recursion.Level1;

public class Q11_CountZeros {
    public static void main(String[] args) {
        System.out.println(count(100230));
    }

    static int count(int num) {
        // INPUT EDGE CASE // The whole number itself is 0
        if(num == 0) {
            return 1;
        }

        return helper(num, 0);
    }

    private static int helper(int num, int count) {
        // base case = RECURSION STOP
        // We have processed all digits // num is reduced digit by digit // eventually becomes 0 → stop recursion
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

/*

🔹 Step 1: Understand the two num == 0 cases

✅ Case A (in count() method)
if(num == 0) {
    return 1;
}

✅ Case B (in helper() method)
if (num == 0) {
    return count;
}


⚠️ These TWO are NOT the same “zero”

This is the key confusion.
🧠 1. count() base case = INPUT EDGE CASE
count(0)
👉 This means:
“The whole number itself is 0”
So logically:
number = 0
it has 1 zero digit
👉 That’s why:
return 1;


🧠 2. helper() base case = RECURSION STOP
if (num == 0)
👉 This means:
“We have processed all digits”
So here:
num is reduced digit by digit
eventually becomes 0 → stop recursion
 */