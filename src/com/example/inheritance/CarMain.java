package com.example.inheritance;

public class CarMain {
    public static void main(String[] args) {
        // 객체생성
        ElectricCar ec = new ElectricCar();
        GasCar gc = new GasCar();

        // 연료주입
        ec.injectFuel(10000);
        gc.injectFuel(20000);

        // 주행
        ec.go();
        gc.go();
    }
}
