package com.Netcracker.MyPoint;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint(){}

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public MyPoint(MyPoint another){
        this.x = another.x;
        this.y = another.y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int[] getXY(){
        return new int[] {x,y};
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y){
        double dist = Math.sqrt(Math.pow(this.x - x, 2) +
                Math.pow(this.y - y, 2));
        return dist;
    }

    public double distance(MyPoint another){
        double dist = Math.sqrt(Math.pow(this.x - another.x, 2) +
                Math.pow(this.y - another.y, 2));
        return dist;
    }

    public double distance(){
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(!(obj instanceof  MyPoint)){
            return false;
        }

        MyPoint mp = (MyPoint) obj;

        return this.x == mp.x &&
                this.y == mp.y;
    }

    @Override
    public int hashCode(){
        int hashCode = 23;

        hashCode = 31 * hashCode + this.x;
        hashCode = 31 * hashCode + this.y;

        return hashCode;
    }

    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
