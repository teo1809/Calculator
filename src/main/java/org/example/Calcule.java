package org.example;

public class Calcule {
    protected double rezultat=0;

    public Calcule(double rezultat){
        this.rezultat=rezultat;
    }
    public Calcule(){}

    public Calcule add(double value)
    { this.rezultat+=value;
    return this;}
    public Calcule divide(double value)
    {   if(value==0) {
        throw new IllegalArgumentException("nu merge");
    }
        this.rezultat/=value;
    return this;}
    public Calcule multiply(double value)
    { this.rezultat*=value;
    return this;}

    public Calcule substract(double value)
    {
        this.rezultat-=value;
        return this;
    }

    public double getResult(){
        return rezultat;
    }
}
