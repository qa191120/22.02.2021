package com.example;

public class Android extends MobilePhone {
    protected double android_os;

    public Android(String color, float size, double android_os) {
        super(color, size);
        this.android_os = android_os;
    }

    public void printAndroidOs(){
        System.out.println(String.format("Android os version %f", android_os));
    }

    @Override
    public String toString() {
        return "Android{" +
                "android_os=" + android_os +
                '}' + super.toString();

    }
}
