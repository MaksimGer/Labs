package com.Netcracker.MyPolynomial;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double ... coeffs){
        if(coeffs.length != 0){
            this.coeffs = new double[coeffs.length];
            for(int i = 0; i < coeffs.length; i++){
                this.coeffs[i] = coeffs[i];
            }
        }
    }

    public int getDegree(){
        if(this.coeffsExist())
            return coeffs.length - 1;
        else return -1;
    }

    public double evaluate(double x){
        double res = 0;
        if(this.coeffsExist()){
            res += coeffs[0];
            for(int i = 1; i < coeffs.length; i++) {
                res += coeffs[i] * Math.pow(x, i);
            }
        }
        return res;
    }

    public MyPolynomial add(MyPolynomial right){
        double[] newCoeffs;

        if(this.coeffs.length >= right.coeffs.length){
            newCoeffs = new double[this.coeffs.length];
            for(int i = 0; i < right.coeffs.length; i++){
                newCoeffs[i] = this.coeffs[i] + right.coeffs[i];
            }
            for(int i = right.coeffs.length; i < this.coeffs.length; i++){
                newCoeffs[i] = this.coeffs[i];
            }
        }
        else{
            newCoeffs = new double[right.coeffs.length];
            for(int i = 0; i < this.coeffs.length; i++){
                newCoeffs[i] = this.coeffs[i] + right.coeffs[i];
            }
            for(int i = this.coeffs.length; i < right.coeffs.length; i++){
                newCoeffs[i] = right.coeffs[i];
            }
        }

        return new MyPolynomial(newCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right){

        double[] newCoeffs = new double[this.getDegree() + right.getDegree() + 1];
        for(int i = 0; i< newCoeffs.length; i++){
            newCoeffs[i] = 0;
        }
        for(int i = 0; i < this.coeffs.length; i++){
            for(int j = 0; j < right.coeffs.length; j++){
                newCoeffs[i+j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(newCoeffs);
    }

    public boolean coeffsExist(){
        if (coeffs != null)
            return true;
        else
            return false;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(!(obj instanceof MyPolynomial)){
            return false;
        }

        MyPolynomial mp = (MyPolynomial) obj;
        if(this.coeffs.length != mp.coeffs.length){
            return false;
        }

        for(int i = 0; i < mp.coeffs.length; i++){
            if(this.coeffs[i] != mp.coeffs[i]){
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode(){
        int hashCode = 17;

        for(int i = 0; i< coeffs.length; i++){
            long coeff = Double.doubleToLongBits(this.coeffs[i]);
            hashCode = 31 * hashCode + (int)(coeff^(coeff >>> 32));
        }

        return hashCode;
    }

    @Override
    public String toString(){
        String polyToString = "";
        if(this.coeffsExist()){
            if(coeffs.length > 1){
                for(int i = coeffs.length -1; i > 0; i--){
                    polyToString += "(" + coeffs[i] + ")X^" + i + "+";
                }
            }
            polyToString += "(" + coeffs[0] + ")";
        }
        else
            polyToString = "undefined";

        return polyToString;
    }
}
