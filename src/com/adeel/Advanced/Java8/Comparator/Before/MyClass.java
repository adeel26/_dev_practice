package com.adeel.Advanced.Java8.Comparator.Before;

import java.util.Comparator;

public class MyClass implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return b - a;
    }
}

/*
“a - b → ascending, b - a → descending”

Reason: Comparator uses negative / positive return values to decide order.

Comparator<Integer> c = (a, b) -> a - b;  // ascending
Comparator<Integer> c = (a, b) -> b - a;  // descending

 */

/*
Implementation using anonymous class

Comparator<Dog> c = new Comparator<Dog>() {
    public int compare(Dog d1, Dog d2) {
        return d1.age - d2.age;
    }
};

Collections.sort(dogs, c);

 */