package com.example;

public class Circle extends Shape {

    protected double m_radius;

    public Circle(String m_name, double m_radius) {
        super(m_name);
        this.m_radius = m_radius;
    }

    public double getCircleHekef() {
        return 2 * Math.PI * m_radius;
    }
}
