package com.brainacad.oop.testgenerics1;

public class Main {
    public static void main(String[] args) {
        MyTuple<String, Integer, Long> objOne = new MyTuple<>("Test", 10,  20L);
        MyTuple<Double, String, String> objTwo = new MyTuple<>(5.2, "test", "test2");
    }
}
