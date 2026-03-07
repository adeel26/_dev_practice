package com.adeel.Advanced.Java8.Predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example1 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        for (Integer i : numbers){
            if(isEven.test(i)){
                System.out.println(i + " ");
            }
        }


        // Another scenario
        System.out.println("Predicate for checking first letter");

        Predicate<String> startsWithLetterK = x -> x.toLowerCase().charAt(0) == 'k';
        System.out.println(startsWithLetterK.test("King"));


    }
}

/*

Predicate<Integer> isEven = new Predicate<Integer>() {
    @Override
    public boolean test(Integer x) {
        return x % 2 == 0;
    }
};


 */