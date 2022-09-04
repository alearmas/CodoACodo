package com.aarmas.safedriving;

public class Driver extends Person {

    private int drivingLicence;

    public Driver(String firstname, String lastname) {
        super(firstname, lastname);
    }

    public int getDrivingLicence() {
        return drivingLicence;
    }

    public void setDrivingLicence(int drivingLicence) {
        this.drivingLicence = drivingLicence;
    }

    public static boolean hasLicense(int drivingLicence) {
        return drivingLicence > 1;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "firstname = '" + firstname + '\'' +
                ", lastname = '" + lastname + '\'' +
                ", drivingLicence = " + drivingLicence +
                '}';
    }
}
