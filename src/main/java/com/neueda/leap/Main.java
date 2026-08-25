package com.neueda.leap;

public class Main {

    public static String greet(String name) {
        return "Hello " + name + " from Sprint 1";
    }

    public static String greet() {
        return greet("World");
    }

    public static void main(String[] args) {
        System.out.println(greet("team"));
    }
}
