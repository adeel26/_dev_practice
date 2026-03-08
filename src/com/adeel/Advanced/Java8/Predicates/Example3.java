package com.adeel.Advanced.Java8.Predicates;

import java.util.function.Predicate;

public class Example3 {
    public static void main(String[] args) {

        Student sdt1 = new Student("Harry", 1);
        Student sdt2 = new Student("Ron", 3);

        // Predicate 1: check if id > 1
        Predicate<Student> idGreaterThan1 = s -> s.getId() > 1;

        // Predicate 2: check if name starts with 'H'
        Predicate<Student> nameStartsWithH = s -> s.getName().startsWith("H");

        // 1: test() – basic predicate
        System.out.println("sdt1 id > 1? " + idGreaterThan1.test(sdt1)); // false
        System.out.println("sdt2 id > 1? " + idGreaterThan1.test(sdt2)); // true

        // 2: negate() – opposite
        System.out.println("sdt1 id NOT > 1? " + idGreaterThan1.negate().test(sdt1)); // true

        // 3: and() – combine two predicates (both must be true)
        Predicate<Student> idAndNameCheck = idGreaterThan1.and(nameStartsWithH);
        System.out.println("std1 id > 1 AND name starts with H? " + idAndNameCheck.test(sdt1));
        System.out.println("std2 id > 1 AND name starts with H? " + idAndNameCheck.test(sdt2));

        // 4: or() – combine two predicates (any one true)
        Predicate<Student> idOrNameCheck = idGreaterThan1.or(nameStartsWithH);
        System.out.println("sdt1 id>1 OR name starts with H? " + idOrNameCheck.test(sdt1)); // true
        System.out.println("sdt2 id>1 OR name starts with H? " + idOrNameCheck.test(sdt2)); // true

    }


    private static class Student {
        private String name;
        private int id;

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        String getName(){
            return this.name;
        }

        int getId() {
            return this.id;
        }

        void setName(String name) {
            this.name = name;
        }

        void setId(int id) {
            this.id = id;
        }
    }

}



