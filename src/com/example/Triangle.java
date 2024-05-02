package com.example;

// 상속
public class Triangle extends Shape {
    @Override
    public double area(int width, int height) {
        double result = (width * height) / 2;   // 재정의
        return result;
    }

    public static void main(String[] args) {
        Triangle tri = new Triangle();
        double result = tri.area(3, 4);
        System.out.println(result);
    }
}
