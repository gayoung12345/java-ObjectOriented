package com.example;
                        // 상속
public class Rectangle extends Shape{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        double result = rect.area(3,4);
        System.out.println(result);
    }
}
