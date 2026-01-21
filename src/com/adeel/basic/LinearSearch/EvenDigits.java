package com.adeel.basic.LinearSearch;
// Find number of numbers that have even numbers of digits
public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12, 2, 346, 2355, 333};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(even(arr[i])){
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numberofdigits = digits(num);
        /*
        if(numberofdigits % 2 == 0){
            return true;
        }
        return false;
        */
        return numberofdigits % 2 == 0;
    }

    // count number of digits in a number
    static int digits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
