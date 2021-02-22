package com.example;

public class Lumia extends MobilePhone {
    protected double msVersion;

    public Lumia(String color, float size, double msVersion) {
        super(color, size);
        this.msVersion = msVersion;
    }

    public void printMsOs(){
        System.out.println(String.format("Lumia os version %f", msVersion));
    }

    @Override
    public String toString() {
        return "Lumia{" +
                "msVersion=" + msVersion +
                '}' + super.toString();
    }
}
