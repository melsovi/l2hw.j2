package com.company;

public class Bed extends Furniture{
    private String size;

    public Bed(String name, int number, String size) {
        super(name, number);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void print() {
        System.out.println(getName() + " " + getNumber() + " " + getSize());
    }
}
