package com.aarmas.safedriving;

public class Car extends Vehicle {

    private boolean extraWheel;

    public Car(String manufacturer, String model, int maxSpeed, Driver owner, boolean extraWheel) {
        super(manufacturer, model, maxSpeed, owner);
        this.extraWheel = extraWheel;
    }

    public boolean hasExtraWheel() {
        return extraWheel;
    }

    public void setExtraWheel(boolean extraWheel) {
        this.extraWheel = extraWheel;
    }

    public static boolean safeCar(boolean extraWheel, int maxSpeed) {
        return extraWheel && maxSpeed <= 140;
    }

}
