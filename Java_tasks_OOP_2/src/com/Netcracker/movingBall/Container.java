package com.Netcracker.movingBall;

public class Container {
    private int x1, y1, x2, y2;

    public Container(int x, int y, int width, int height){
        if(x >=0 && y >= 0 && width > 0 && height > 0) {
            x1 = x;
            y1 = y;
            x2 = x + width;
            y2 = y + height;
        }
    }

    public int getX(){
        return x1;
    }

    public int getY(){
        return  y1;
    }

    public int getWidth(){
        return x2 - x1;
    }

    public int getHeight(){
        return y2 - y1;
    }

    public boolean collides(Ball ball){
        if((ball.getX() - ball.getRadius()) > this.x1 &&
                (ball.getY() - ball.getRadius() > this.y1) &&
                (ball.getX() + ball.getRadius() < this.x2) &&
                (ball.getY() + ball.getRadius() < this.y2))
            return true;
        else
            return false;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(!(obj instanceof Container)){
            return false;
        }

        Container container = (Container) obj;
        return this.x1 == container.x1 &&
                this.x2 == container.x2 &&
                this.y1 == container.y1 &&
                this.y2 == container.y2;
    }

    @Override
    public int hashCode(){
        int hashCode = 17;

        hashCode = 31 * hashCode + this.x1;
        hashCode = 31 * hashCode + this.y1;
        hashCode = 31 * hashCode + this.x2;
        hashCode = 31 * hashCode + this.y2;

        return hashCode;
    }

    @Override
    public String toString(){
        return "Container[(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
    }
}
