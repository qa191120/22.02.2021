package com.example;

public class MobilePhone {

    protected String color;
    protected float size;

    public MobilePhone(String color, float size) {
        this.color = color;
        this.size = size;
    }
    @Override
    public String toString() {
        return "MobilePhone1{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}

