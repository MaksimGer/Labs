package com.Netcracker.movingBall;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction){
        this.x = x;
        this.y = y;
        if(radius > 0)
            this.radius = radius;
        if(direction >= -180 && direction <= 180 && speed >=0) {
            xDelta = (float) (speed * Math.sin(direction));
            yDelta = (float) (-1 * speed * Math.cos(direction));
        }
        else{
            xDelta = 0;
            yDelta = 0;
        }
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        if(radius >= 0)
            this.radius = radius;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        x+= xDelta;
        y+= yDelta;
    }

    public void reflectHorizont(){
        xDelta *= -1;
    }

    public void reflectVertical(){
        yDelta *= -1;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(!(obj instanceof Ball)){
            return false;
        }

        Ball ball = (Ball) obj;

        return this.x == ball.x &&
                this.y == ball.y &&
                this.radius == ball.radius &&
                this.xDelta == ball.xDelta &&
                this.yDelta == ball.yDelta;
    }

    @Override
    public int hashCode(){
        int hashCode = 17;

        hashCode = 31 * hashCode + this.radius;
        hashCode = 31 * hashCode + Float.floatToIntBits(this.x);
        hashCode = 31 * hashCode + Float.floatToIntBits(this.y);
        hashCode = 31 * hashCode + Float.floatToIntBits(this.xDelta);
        hashCode = 31 * hashCode + Float.floatToIntBits(this.yDelta);

        return hashCode;
    }

    @Override
    public String toString(){
        return "Ball[(" + x + "," + y + "), speed = (" +
            xDelta + "," + yDelta + ")]";
    }

}
