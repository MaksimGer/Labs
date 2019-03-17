package com.Netcracker.Circle;

public class Circle {

    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }


    public Circle(double radius) {
        if(radius > 0)
            this.radius = radius;
    }

    public Circle(double radius, String color) {
        if(radius > 0)
            this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public String getColor(){
        return color;
    }

    public void setRadius(double radius){
        if(radius > 0)
            this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(!(obj instanceof Circle)){
            return false;
        }

        Circle circle = (Circle) obj;
        return this.radius == circle.radius &&
                this.color.equals(circle.color);
    }

    @Override
    public int hashCode(){
        int hashCode = 23;
        long longRad = Double.doubleToLongBits(radius);

        hashCode = 31 * hashCode + (int)(longRad^(longRad >> 32));
        hashCode = 31 * hashCode + color.hashCode();

        return hashCode;
    }

    @Override
    public String toString() {
        return "Circle[radius = " + radius +
                ", color = " + color + "]";
    }
}
