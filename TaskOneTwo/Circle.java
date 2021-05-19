package com.example.lr3.TaskOneTwo;

public class Circle {

    private double radius;
    private String color;

    public Circle() {
        color = "Yellow";
        radius = 4.3;
    }

    public Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color){
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return 3.14 * (radius * radius);
    }

    public String toString() {
        return "The circle with radius: " + getRadius() + ", and color: " + getColor() +
                ". And him Area is: " + getArea();
    }
}
