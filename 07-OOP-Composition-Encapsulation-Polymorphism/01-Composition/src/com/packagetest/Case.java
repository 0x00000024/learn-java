package com.packagetest;

public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimension;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dismension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimension = dismension;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimension() {
        return dimension;
    }
}