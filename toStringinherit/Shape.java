package com.example;

public class Shape {
    protected String m_name;

    public Shape(String m_name) {
        this.m_name = m_name;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "m_name='" + m_name + '\'' +
                '}';
    }
}
