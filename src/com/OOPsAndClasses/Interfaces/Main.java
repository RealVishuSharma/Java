package com.OOPsAndClasses.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car cars = new Car();

        cars.acc();
        cars.start();
        cars.stop();

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine(new ElectricEngine());
        car.start();

    }
}
