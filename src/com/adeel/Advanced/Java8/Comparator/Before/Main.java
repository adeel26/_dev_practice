package com.adeel.Advanced.Java8.Comparator.Before;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4,0, 91, 42);
        Collections.sort(list, new MyClass());
        System.out.println(list);
    }
}
