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
        System.out.println(calc.getRezultat());

        CalculatorV2 calc2= new CalculatorV2(calc.getRezultat());
        calc2.Sqrt();
        System.out.println(calc2.getRezultat());
    }
}