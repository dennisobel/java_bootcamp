package com.dennisobel.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.accelerate();
//        car.start();
//        car.stop();
//        car.brake();
        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
        car.startMusic();
    }
}
