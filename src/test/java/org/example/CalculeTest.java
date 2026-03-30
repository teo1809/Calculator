package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculeTest {

    @Test
    void add_worksWithPositiveNumbers() {
        // arrange
        Calcule calcule=new Calcule(0);
        // act
        calcule.add(5);
        // assert
        assertEquals(5,calcule.getResult());
    }

    @Test
    void add_worksWithNegativeNumbers() {
        // arrange
        Calcule calcule=new Calcule(20);
        // act
        calcule.add(-5);
        // assert
        assertEquals(15,calcule.getResult());
    }

    @Test
    void divide_worksWithStrictlyPositiveNumbers() {
        // arrange
        Calcule calcule=new Calcule(20);
        //act
        calcule.divide(5);
        //assert
        assertEquals(4,calcule.getResult());
    }

    @Test
    void divide_throwsExceptionWhenDividingByZero() {
        // arrange
        Calcule calcule=new Calcule(20);
        //act
       // calcule.divide(0);
        //assert+act
        assertThrows(IllegalArgumentException.class, () ->calcule.divide(0));
    }

    @Test
    void multiply_worksWithPositiveNumbers() {
        //arrange
        Calcule calcule = new Calcule(10);
        //act
        calcule.multiply(3);
        //assert
        assertEquals(30, calcule.getResult());
    }

    @Test
    void multiply_worksWithZero() {
        //arrange
        Calcule calcule = new Calcule(10);
        //act
        calcule.multiply(0);
        //assert
        assertEquals(0, calcule.getResult());
    }

    @Test
    void substract_worksWithPositiveNumbers() {
        //arrange
        Calcule calcule = new Calcule(10);
        //act
        calcule.substract(4);
        //assert
        assertEquals(6, calcule.getResult());
    }

    @Test
    void substract_resultsInNegativeNumber() {
        //arrange
        Calcule calcule = new Calcule(5);
        //act
        calcule.substract(10);
        //assert
        assertEquals(-5, calcule.getResult());
    }
    @Test
    void Sqrt_worksWithPerfectSquare() {
        //arrange
        CalculatorV2 calc2 = new CalculatorV2(16);
        //act
        calc2.Sqrt();
        //assert
        assertEquals(4, calc2.getResult());
    }

    @Test
    void Sqrt_worksWithZero() {
        //arrange
        CalculatorV2 calc2 = new CalculatorV2(0);
        //act
        calc2.Sqrt();
        //assert
        assertEquals(0, calc2.getResult());
    }

    @Test
    void getRezultat_returnsCorrectInitialValue() {
        //arrange
        Calcule calcule = new Calcule(100);
        //act + assert
        assertEquals(100, calcule.getResult());
    }
}