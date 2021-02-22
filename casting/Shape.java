package com.example;

public class Shape {
    protected String m_name;

    public Shape(String m_name) {
        this.m_name = m_name;
    }

    public String getDescription() {
        return "I am Shape";
    }

    @Override
    public String toString() {
        return "Shape{" +
                "desc = " + getDescription() +
                ", m_name='" + m_name + '\'' +
                '}';
    }
}
