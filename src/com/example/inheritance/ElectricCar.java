package com.example.inheritance;

public class ElectricCar extends Car {

    public ElectricCar() {
        System.out.println("ElectricCar class default Constructor call");
    }

    @Override
    public void injectFuel(int money) {
        System.out.println("Electric Car Charge");
    }

    @Override
    public void go() {
        System.out.println("Go Electric Car");
    }
}
