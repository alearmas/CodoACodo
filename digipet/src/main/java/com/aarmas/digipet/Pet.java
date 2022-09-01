package com.aarmas.digipet;

public class Pet implements PetImpl {

    private String name;
    private String state;
    private Integer level;

    public Pet(String name) {
        this.name = name;
    }

    @Override
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
        /* Si está hambrienta, se pone contenta.
           Si está contenta, level++.
           Si está aburrida, y hace más de 80 minutos que está aburrida, entonces se pone contenta.
           Si está aburrida desde hace 80 minutos o menos, entonces no le pasa nada, no cambia nada.*/
    }

    @Override
    public void playPet() {

    }
}
