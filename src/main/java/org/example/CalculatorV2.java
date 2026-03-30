package org.example;

import static java.lang.Math.sqrt;

public class CalculatorV2 extends Calcule{

   public CalculatorV2(){}

    public CalculatorV2(double rezultat) {
        super(rezultat);
    }

    public void Sqrt(){
        this.rezultat=sqrt(this.rezultat);
    }
}
