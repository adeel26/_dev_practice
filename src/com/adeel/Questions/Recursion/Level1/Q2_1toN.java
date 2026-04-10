package com.adeel.Questions.Recursion.Level1;

// 1 to N
public class Q2_1toN {
    public static void main(String[] args) {
        funcRev(5);
    }

    static void funcRev(int n) {
        if(n == 0){
            return;
        }
        funcRev(n - 1);
        System.out.println(n);
    }
}
