package com.example.inheritance;

public class GasCar extends Car {

    public GasCar() {
        System.out.println("GasCar class default Constructor call");
    }

    @Override
    public void injectFuel(int money) {
        System.out.println("Gas Car Fill Up");
    }

    @Override
    public void go() {
        System.out.println("GO Gas Car");
    }
}
