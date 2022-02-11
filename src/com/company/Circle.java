package com.company;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        double area = radius*radius*Math.PI;
        return area;
    }
}
