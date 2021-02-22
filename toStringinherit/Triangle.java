package com.example;

public class Triangle extends Shape {

    protected double m_a, m_b, m_c;

    public Triangle(String m_name, double m_a, double m_b, double m_c) {
        super(m_name);
        this.m_a = m_a;
        this.m_b = m_b;
        this.m_c = m_c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "m_a=" + m_a +
                ", m_b=" + m_b +
                ", m_c=" + m_c +
                //", m_name='" + m_name + '\'' +
                "} "+
                super.toString();
    }
}
