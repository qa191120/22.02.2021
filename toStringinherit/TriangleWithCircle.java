package com.example;

public class TriangleWithCircle extends Triangle{

    protected double m_radius;

    public TriangleWithCircle(String m_name, double m_a, double m_b, double m_c, double m_radius) {
        super(m_name, m_a, m_b, m_c);
        this.m_radius = m_radius;
    }

    @Override
    public String toString() {
        return "TriangleWithCircle{" +
                "m_radius=" + m_radius +
                "'}' "+
                super.toString();
    }
}
