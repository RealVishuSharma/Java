package com.OOPsAndClasses.Interfaces;

public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("Media Started!");
    }

    @Override
    public void stop() {
        System.out.println("Media Stopped!");
    }
}
