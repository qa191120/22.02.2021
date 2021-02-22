package com.example;

public class IPhone extends MobilePhone {
    protected double iosVersion;

    public IPhone(String color, float size, double iosVersion) {
        super(color, size);
        this.iosVersion = iosVersion;
    }

    public void printIphoneos(){
        System.out.println(String.format("IPhone os version %f", iosVersion));
    }

    @Override
    public String toString() {
        return "iPhone{" +
                "iosVersion=" + iosVersion +
                '}' + super.toString();
    }
}

