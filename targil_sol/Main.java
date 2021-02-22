package com.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        MobilePhone[] phones = new MobilePhone[3];
        phones[0] = new Android("black", 5.7f, 11.7);
        phones[1] = new IPhone("white", 5.2f, 10.4);
        phones[2] = new Android("blue", 5.1f, 5);
        for(int i = 0; i < phones.length; i++) {
            printOs(phones[i]);
        }
    }

    private static void printOs(MobilePhone mp)
    {
        if (mp instanceof Android) {
            Android android = (Android)mp;
            android.printAndroidOs();
        }
        else if (mp instanceof IPhone) {
            IPhone iphone = (IPhone) mp;
            iphone.printIphoneos();
        }
        else if (mp instanceof Lumia) {
            Lumia lumia = (Lumia) mp;
            lumia.printMsOs();
        }
        else
        {
            // will discussed later....
            throw new ClassCastException("Unknown class");
        }
    }


}
