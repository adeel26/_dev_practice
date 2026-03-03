package com.adeel.Advanced.Java8.Streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> myStream = list.stream();
    }
}

/*
A Stream in Java is a way to process collections (like List, Set) in a functional style.
Stream = A pipeline to process data step-by-step.
Collection → Stream → Operations → Result

Why Streams Were Introduced?
Introduced in Java 8
To:
Reduce boilerplate code
Support functional programming
Make parallel processing easier

Two Types of Operations
1️⃣ Intermediate Operations (Return Stream)
filter()
map()
sorted()
distinct()

They don’t execute immediately.
They build the pipeline.

2️⃣ Terminal Operations (End the Stream)
forEach()
collect()
count()
reduce()

Execution happens only when terminal operation runs.
This is called Lazy Evaluation.

Important Concepts
🔹 filter()
Filters data based on condition.

🔹 map()
Transforms each element.

🔹 reduce()
Combines elements into single result.

 */