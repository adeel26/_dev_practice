package com.adeel.Questions.Recursion.Level1;

public class Q_R_Lvl1_3 {
    public static void main(String[] args) {
        funcBoth(5);
    }
    static void funcBoth (int n) {
        // Base case: stop recursion when n becomes 0
        if(n == 0){
            return;
        }
        // =========================
        // BEFORE recursive call (GOING DOWN the stack)
        // =========================
        // This prints while function calls are being ADDED to stack

        // Example flow if funcBoth(3):
        // funcBoth(3) -> print 3
        // funcBoth(2) -> print 2
        // funcBoth(1) -> print 1
        System.out.println(n);

        // Recursive call: function calls itself with n-1
        // (going deeper into stack)
        funcBoth(n-1);

        // =========================
        // AFTER recursive call (COMING BACK / UNWINDING stack)
        // =========================
        // This prints while function calls are being REMOVED from stack

        // Reverse flow:
        // funcBoth(1) resumes -> print 1
        // funcBoth(2) resumes -> print 2
        // funcBoth(3) resumes -> print 3

        System.out.println(n);
    }
}

/*
Actual Tree for funcBoth(3)

funcBoth(3)
├── print 3   (before call)
└── funcBoth(2)
    ├── print 2
    └── funcBoth(1)
        ├── print 1
        └── funcBoth(0)
            └── return
        └── print 1   (after call)
    └── print 2
└── print 3


Step-by-step execution
⬇️ Going DOWN (stack building)
funcBoth(3) → print 3
funcBoth(2) → print 2
funcBoth(1) → print 1
funcBoth(0) → return
⬆️ Coming BACK (stack unwinding)
funcBoth(1) resumes → print 1
funcBoth(2) resumes → print 2
funcBoth(3) resumes → print 3
🎯 Final Output
3 2 1 1 2 3
 */