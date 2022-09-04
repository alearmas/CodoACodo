package com.aarmas.safedriving;

public class Bike extends Vehicle {

    private int mirrors;
    private boolean helmet;

    public Bike(String manufacturer, String model, int maxSpeed, Driver owner, int mirrors, boolean helmet) {
        super(manufacturer, model, maxSpeed, owner);
        this.mirrors = mirrors;
        this.helmet = helmet;
    }

    public int getMirrors() {
        return mirrors;
    }

    public void setMirrors(int mirrors) {
        this.mirrors = mirrors;
    }

    public boolean hasHelmet() {
        return helmet;
    }

    public void setHelmet(boolean helmet) {
        this.helmet = helmet;
    }

    public static boolean safeBike(int mirrors, int maxSpeed) {
        return mirrors >= 2 && maxSpeed <= 160;
    }

}
