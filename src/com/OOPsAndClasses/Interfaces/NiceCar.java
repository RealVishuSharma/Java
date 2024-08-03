package com.OOPsAndClasses.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media music;

    public NiceCar() {
        engine = new PowerEngine();
        music = new CDPlayer();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        music.start();
    }

    public void stopMusic() {
        music.stop();
    }

    public void upgradeEngine(Engine engine) {
        this.engine = engine;
    }
}
