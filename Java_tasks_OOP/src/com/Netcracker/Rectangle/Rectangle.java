package com.Netcracker.Rectangle;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle(){}

    public Rectangle(float length, float width){
        if(length > 0)
            this.length = length;
        if(width > 0)
            this.width = width;
    }

    public float getLength(){
        return length;
    }
    public float getWidth(){
        return width;
    }

    public void setLength(float length){
        if(length > 0)
            this.length = length;
    }
    public void setWidth(float width){
        if(width > 0)
            this.width = width;
    }

    public double getPerimeter(){
        return 2*(length + width);
    }

    public double getArea(){
        return length * width;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(!(obj instanceof Rectangle)){
            return false;
        }

        Rectangle rectangle = (Rectangle) obj;
        return this.length == rectangle.length &&
                this.width == rectangle.width;
    }

    @Override
    public int hashCode(){
        int hashCode = 23;
        hashCode = 31 * hashCode + Float.floatToIntBits(length);
        hashCode = 31 * hashCode + Float.floatToIntBits(width);

        return hashCode;
    }

    @Override
    public String toString(){
        return "Rectangle[length = " + length +
                ", width = " + width + "]";
    }
}
