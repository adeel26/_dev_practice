package com.adeel.DSA.Recursion;

public class Recursion {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        // Base condition in Recursion
        // Condition where our recursion will stop making new calls.
        if (n == 5) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        print(n + 1);
    }
}

/*
Recursion: Function calling itself

Why Recursion ?
-> It helps us in solving bigger / complex  problems in a simple way.
-> We can convert recursion solution into iteration and vice versa.
-> Space complexity is not constant because of recursive calls.
-> It helps us in breaking down bigger problems into smaller problems.

 */



/*
No base condition:
-> Function calls will keep happening
-> Stack will be keep getting filled again and again.
-> Every function call will take some memory.
-> Memory of computer will exceed the limit.
-> Stack Overflow error.
 */


/*
How to understand and approach a problem:
1: Identify if you can break down problem into smaller problems.
2: Write the recurrence relation if needed.
3: Draw the recursive tree.
4: About the tree:
   -> See the flow of functions, how they are getting in stack.
   -> Identify and focus on left tree calls and right tree calls.
   -> Draw the tree and pointers again and again using pen and paper.
   -> Use a debugger to see the flow.
5: See how values are returned at each step and what types of values (int, String, etc).
   See where the function call will come out. In the end, you will come out of the main function.

 */