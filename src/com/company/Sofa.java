package com.company;

public class Sofa extends Furniture{
    private String model;
    private String color;

    public Sofa(String name, int number, String model, String color) {
        super(name, number);
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println(getName() + " " + getNumber() + " " + getModel() + " " + getColor());
    }
}
