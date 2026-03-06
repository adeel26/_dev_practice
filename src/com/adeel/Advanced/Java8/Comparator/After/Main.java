package com.adeel.Advanced.Java8.Comparator.After;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Example 1
        List<Integer> list = Arrays.asList(2, 4,0, 91, 42);
        Collections.sort(list,(a, b) -> b - a);
        System.out.println(list);


        // Example 2
        Set<Integer> s1 = new TreeSet<>();
        s1.add(22);
        s1.add(1);
        s1.add(12);
        System.out.println("Before manual sorting: " + s1);

        Set<Integer> s2 = new TreeSet<>((a, b) -> b - a);
        s2.add(22);
        s2.add(1);
        s2.add(12);
        System.out.println("After manual sorting: " + s2);


        // Example 3
        Map<Integer, String> m1 = new TreeMap<>();
        m1.put(2, "z");
        m1.put(5, "f");
        m1.put(3, "k");
        System.out.println("Before manual sorting: " + m1);

        Map<Integer, String> m2 = new TreeMap<>((a, b) -> b - a);
        m2.put(2, "z");
        m2.put(5, "f");
        m2.put(3, "k");
        System.out.println("after manual sorting: " + m2);
    }
}

/*
Below functional interface is used in lambda expression

public int compare(Integer a, Integer b) {
        return b - a;
    }
 */