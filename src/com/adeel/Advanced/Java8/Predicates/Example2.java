package com.adeel.Advanced.Java8.Predicates;

import java.util.function.Predicate;

public class Example2 {
    public static void main(String[] args) {
        Predicate<String> startsWithLetterK = x -> x.toLowerCase().charAt(0) == 'k';
        Predicate<String> endsWithLetterG = x -> x.toLowerCase().charAt(x.length() - 1) == 'g';

        // And Predicate = Used when both conditions must be true.
        Predicate<String> and = startsWithLetterK.and(endsWithLetterG);
        System.out.println(and.test("King"));

        // Or Predicate = Used when any one condition is true.
        Predicate<String> or = startsWithLetterK.or(endsWithLetterG);
        System.out.println(or.test("Knight"));

        // negate() = Used to reverse the result.
        System.out.println(startsWithLetterK.negate().test("King"));

        // isEqual() = Used to check if value equals a specific object.
        // You call it using the interface name, not an object.
        String str1 = "Tom";
        String str2 = "Jerry";
        Predicate<String> isEqualToStr1 = Predicate.isEqual(str1);
        System.out.println(isEqualToStr1.test(str2));


        // In Predicate, isEqual() is static, while and(), or(), and negate() are default methods.
    }
}
