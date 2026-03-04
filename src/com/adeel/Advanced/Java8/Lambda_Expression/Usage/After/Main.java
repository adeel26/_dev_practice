package com.adeel.Advanced.Java8.Lambda_Expression.Usage.After;

public class Main {
    public static void main(String[] args) {
        Employee se = () -> "Software Engineer";
        Employee qa = () -> "Quality Assurance Engineer";
        System.out.println(se.getName());
        System.out.println(qa.getName());
    }
}

/*
Functional Interface reference can be used to hold lambda expression

Using lambda expression we don't need to use any separate implementation class.

 */