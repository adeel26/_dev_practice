package com.adeel.Advanced.Java8.Comparator.After;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleObjects {
    public static void main(String[] args) {
        Student s1 = new Student(2, "Kroos");
        Student s2 = new Student(5, "Ben");
        Student s3 = new Student(3, "John");

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        // Ascending
        Collections.sort(students, (a, b) -> a.id - b.id);
        System.out.println(students);

        // Descending
        Collections.sort(students, (a, b) -> b.id - a.id);
        System.out.println(students);
    }

    static class Student {
        public Integer id;
        public String name;

        public Student(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return this.id + ": " + this.name;
        }
    }
}


