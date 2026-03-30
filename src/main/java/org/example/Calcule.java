package org.example;

public class Calcule {
    protected double rezultat=0;

    public Calcule(double rezultat){
        this.rezultat=rezultat;
    }
    public Calcule(){}

    public void add(double value)
    { this.rezultat+=value;}
    public void divide(double value)
    {   if(value==0) {
        throw new IllegalArgumentException("nu merge");
    }
        this.rezultat/=value; }
    public void multiply(double value)
    { this.rezultat*=value; }

    public void substract(double value)
    {
        this.rezultat-=value;
    }

    public double getRezultat(){
        return rezultat;
    }
}
