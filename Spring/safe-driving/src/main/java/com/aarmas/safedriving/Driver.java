package com.aarmas.safedriving;

public class Driver extends Person {

    private Integer drivingLicence;

    public Driver(String firstname, String lastname) {
        super(firstname, lastname);
    }

    public Integer getDrivingLicence() {
        return drivingLicence;
    }

    public void setDrivingLicence(Integer drivingLicence) {
        this.drivingLicence = drivingLicence;
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
