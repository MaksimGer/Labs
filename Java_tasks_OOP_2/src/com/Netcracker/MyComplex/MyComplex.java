package com.Netcracker.MyComplex;

import java.util.Objects;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex(){}

    public MyComplex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public MyComplex(MyComplex another){
        if(another != null) {
            this.real = another.real;
            this.imag = another.imag;
        }
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public boolean isReal(){
        if(real != 0.0)
            return true;
        else
            return false;
    }

    public boolean isImaginary(){
        if(imag != 0.0)
            return true;
        else
            return false;
    }

    public boolean equals(double real, double imag){
        if(this.real == real && this.imag == imag)
            return true;
        else
            return false;
    }

    public boolean equals(MyComplex another) {
        if(this.real == another.real &&
                this.imag == another.imag)
            return true;
        else
            return false;
    }

    public double magnitude(){
        return Math.sqrt(Math.pow(real,2) + Math.pow(imag,2));
    }

    public double argument(){
        return Math.atan(imag/real);
    }

    public MyComplex add(MyComplex right){
        this.real += right.real;
        this.imag += right.real;
        return this;
    }

    public MyComplex addNew(MyComplex right){
        MyComplex newComplex = new MyComplex(this);
        newComplex.add(right);
        return newComplex;
    }

    public MyComplex substract(MyComplex right){
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex substractNew(MyComplex right){
        MyComplex newComplex = new MyComplex(this);
        newComplex.substract(right);
        return  newComplex;
    }

    public MyComplex multiply(MyComplex right){
        double startReal = this.real;
        this.real = (this.real * right.real) - (this.imag * right.imag);
        this.imag = (startReal * right.imag) + (this.imag * right.real);

        return this;
    }

    public MyComplex divide(MyComplex right){
        double startReal = this.real;
        double denominator = Math.pow(right.real,2) + Math.pow(right.imag, 2);
        this.real = (this.real * right.real + this.imag * right.imag) /
                denominator;
        this.imag = (right.real * this.imag - startReal * right.imag) /
                denominator;

        return this;
    }

    public MyComplex conjugate(){
        return new MyComplex(this.real, (this.imag * -1));
    }

    @Override
    public boolean equals(Object object){

        if(this == object){
            return true;
        }

        if(!(object instanceof MyComplex)){
            return false;
        }

        MyComplex myComplex = (MyComplex) object;
        return this.real == myComplex.real &&
                this.imag == myComplex.imag;
    }

    @Override
    public int hashCode(){
        int hashCode = 17;
        long r = Double.doubleToLongBits(this.real);
        long i = Double.doubleToLongBits(this.imag);

        hashCode = 31 * hashCode + (int)(r^(r >>> 32));
        hashCode = 31 * hashCode + (int)(i^(i >>> 32));

        return hashCode;
    }

    @Override
    public String toString(){
        if(imag >= 0.0)
            return "(" + real + "+" + imag + "i)";
        else
            return "(" + real + imag + "i)";
    }
}
