package com.adeel.Advanced.Java8.Predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    // Predicate =      Predicate is a functional interface that represents a boolean valued function
    //                  of one argument.
    //                  Predicate is a functional interface used to test a condition and return
    //                  true or false.
    //                  A function that takes input and returns boolean
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 100000;
        System.out.println(predicate.test(100));

        // Another scenario
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum();

        // Now above line as normal code
        int sum2 = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 == 0) {
                sum2 = sum2 + numbers.get(i);
            }
        }

        // Or
        /*

        int sum2 = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
            sum2 = sum2 + num;
            }
        }

         */

    }

}
