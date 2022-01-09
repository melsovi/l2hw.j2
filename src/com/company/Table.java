package com.company;

public class Table extends Furniture{
    private String material;
    private String form;

    public Table(String name, int number, String material, String form) {
        super(name, number);
        this.material = material;
        this.form = form;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public void print() {
        System.out.println(getName() + " " + getNumber() + " " + getMaterial() + " " + getForm());
    }
}
