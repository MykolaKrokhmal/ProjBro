package com.krokhmal.lessons.lection011;

import com.krokhmal.lessons.lection011.Figure;

public class Circle extends Figure {


    private double radius;

    public Circle(double radius) {
        this.radius = Math.abs(radius);
    }

    @Override
    protected double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    protected double getPerimeter() {
        return 2 * Math.PI * Math.abs(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = Math.abs(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} ";
    }
}
