package com.Netcracker.MyTriangle;

import com.Netcracker.MyPoint.MyPoint;

public class MyTriangle {
    private MyPoint v1, v2, v3;

    public MyTriangle(int x1, int y1, int x2,
                      int y2, int x3, int y3){
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = new MyPoint(v1);
        this.v2 = new MyPoint(v2);
        this.v3 = new MyPoint(v3);
    }

    public double getPerimeter(){
        double perim = v1.distance(v2)
                + v2.distance(v3) + v3.distance(v1);
        return perim;
    }

    public String getType(){
        if((v1.distance(v2) != v1.distance(v3)) &&
                (v2.distance(v1) != v2.distance(v3)))
            return "Scalene";
        else{
            if((v1.distance(v2) == v1.distance(v3)) &&
                    (v2.distance(v1) == v2.distance(v3)))
                return "Equilateral";
            else
                return "Isosceles";
        }
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(!(obj instanceof MyTriangle)){
            return false;
        }

        MyTriangle mt = (MyTriangle) obj;
        return this.v1.equals(mt.v1) &&
                this.v2.equals((mt.v2)) &&
                this.v3.equals((mt.v3));
    }

    @Override
    public int hashCode(){
        int hashCode = 23;

        hashCode = 31 * hashCode + v1.hashCode();
        hashCode = 31 * hashCode + v2.hashCode();
        hashCode = 31 * hashCode + v3.hashCode();

        return hashCode;
    }

    @Override
    public String toString(){
        return "MyTriangle[v1=" + v1.toString() + ",v2=" +
                v2.toString() + ",v3=" + v3.toString() + "]";
    }

}
