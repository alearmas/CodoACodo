package com.aarmas.digipet;

public class Pet implements PetImpl {

    private String name;
    private String state;
    private Integer level;

    public Pet(String name) {
        this.name = name;
        this.level = 1;
        this.state = "hungry";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public void feedPet() {
        String state = getState();
        switch (state) {
            case "happy":
                setLevel(getLevel() + 1);
                System.out.println(getName() + " ha incrementado su nivel (Nuevo nivel - " + getLevel() + ")");
                break;
            case "hungry":
                setState("happy");
                System.out.println("Ahora que comió, " + getName() +" se ha puesto feliz");
                break;
            case "bored":
                setState("happy");
                System.out.println("Ha cambiado su estado a feliz");
                break;
            default:
                break;
        }
    }

    @Override
    public void playPet() {
        String state = getState();
        switch (state) {
            case "happy":
                setLevel(getLevel() + 2);
                System.out.println(getName() + " ha incrementado su nivel (Nuevo nivel - " + getLevel() + ")");
                break;
            case "bored":
                setState("happy");
                System.out.println("Ahora que hemos jugado, " + getName() + " se ha puesto feliz");
                break;
            case "hungry":
                System.out.println(getName() + " tiene hambre y no quiere jugar");
                break;
            default:
                break;
        }
    }

    public void sleepPet() {
        String state = getState();
        switch (state) {
            case "happy":
                System.out.println(getName() + " se va a dormir feliz");
                break;
            case "bored":
                System.out.println(getName() + " se va a dormir aburrido");
                break;
            case "hungry":
                System.out.println(getName() + " se va a dormir con hambre");
                break;
        }
    }
}
