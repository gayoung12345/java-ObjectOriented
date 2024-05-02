package com.example.inheritance;

public class Car {
    private String model;
    private String color;

    public Car() {
        System.out.println("Car class default constructor call");
    }

    public void go(){
        System.out.println("Go Car");
    }

    public void injectFuel(int money) {
        System.out.println("연료를 주입 받음");
    }

    public void openDoor() {
        System.out.println("자동차 문을 열음");
    }

}
