package com.adeel.Advanced.Set_HashSet;

import java.util.*;

public class SetAndHashSet {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Adeel");
        names.add("Iqbal");
        names.add("Harris");

        // there won't be any sequence in Set and stores unique values only (no duplicates).
        for (String name: names) {
            System.out.println(name);
        }

        if (names.contains("Adeel")) {
            System.out.println("Exists");
        } else {
            System.out.println("Doesn't Exists");
        }

        // Example: find duplicates using Set (VERY common)
        int[] nums = {1, 2, 3, 2, 4};

        Set<Integer> seen = new HashSet<>();

        for (int n : nums) {
            if (!seen.add(n)) {
                System.out.println("Duplicate: " + n);
            }
        }


        System.out.println("Remove Duplicates");
        // Remove duplicates
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(2);
        numberList.add(1);
        System.out.println(numberList);
        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numberList);
        System.out.println(numberSet);

        // Can be done by constructor of HashSet
        // Set<Integer> numberSet = new HashSet<>(numberList);


        // Via Lambda function
        System.out.println("Lambda function");
        names.forEach(System.out::println);


        // Iterator
        System.out.println("Iterator");
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }

        System.out.println("TreeSet");
        // TreeSet is same, only difference is its add items in their order
        // Performance wise slow then HashSet
        Set<Integer> number = new TreeSet<>();
        number.add(2);
        number.add(8);
        number.add(5);
        number.add(4);
        System.out.println(number);

        // LinkedHashSet is also same but its add items in their insertion order
        // Performance wise same HashSet
        Set<String> students = new LinkedHashSet<>();

    }
}
