package com.OOPsAndClasses.Interfaces;

public class Car implements Engine, Brake{

    @Override
    public void brake() {
        System.out.println("Brake the Car!");
    }

    @Override
    public void start() {
        System.out.println("Start the Car!");
    }

    @Override
    public void stop() {
        System.out.println("Stop the Car!");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate the Car!");
    }
}
