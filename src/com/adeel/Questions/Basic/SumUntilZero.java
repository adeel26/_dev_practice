package com.adeel.Questions.Basic;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;


        while (true) {
            int num = input.nextInt();

            if(num == 0) {
                break;
            }

            sum = sum + num;
        }

        System.out.println("Sum = " + sum);
    }
}
