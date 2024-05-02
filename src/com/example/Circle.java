package com.example;

public class Circle extends Shape {
    @Override
    public double area(int width, int height) {
        double result = Math.PI * (width/2) * (height/2);
        return result;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        double area = circle.area(20, 20);
        System.out.println(area);
    }
}
