package com.example;

public class PenStaticTest {
    public static void main(String[] args) {
        PenStatic.color="blue";
        PenStatic.price=1000;
        System.out.println(PenStatic.color);
        System.out.println(PenStatic.price);
        PenStatic.writer(1);
    }
}
