package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calcule calc = new Calcule();

        double a=12.6;
        double b=13.2;

        calc.add(7.5);
        calc.add(2.4);
        calc.add(4.5);
        calc.divide(4);
        System.out.println(calc.getResult());

        CalculatorV2 calc2= new CalculatorV2(calc.getResult());
        calc2.Sqrt();
        System.out.println(calc2.getResult());

        System.out.println(new Calcule(4).add(7).divide(5).getResult());
    }
}