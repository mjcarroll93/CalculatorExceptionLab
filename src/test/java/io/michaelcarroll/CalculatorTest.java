package io.michaelcarroll;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

   Calculator calculator;

    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void addTwoValuesTest(){
        int expectedValue = 3;
        int actualValue = calculator.add(1,2);
        assertEquals("The expected value is 3", expectedValue, actualValue);
    }

    @Test
    public void subtractFirstValueBySecondValueTest(){
        int expectedValue = 5;
        int actualValue = calculator.subtract(10,5);
        assertEquals("The expected value is 5", expectedValue, actualValue);
    }

    @Test
    public void multiplyTwoValuesTest(){
        int expectedValue = 25;
        int actualValue = calculator.multiply(5,5);
        assertEquals("The expected value is 25", expectedValue, actualValue);
    }

    @Test
    public void divideFirstValueByTheSecondValueTest(){
        int expectedValue = 20;
        int actualValue = 0;
        try {
            actualValue = calculator.divide(100,5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals("The expected value should be 20", expectedValue, actualValue);
    }

    @Test
    public void divideValueByZeroExceptionTest(){
        int expectedValue = 0;
        int actualValue = 0;
        try {
            actualValue = calculator.divide(100,0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals("The expected value should be 20", expectedValue, actualValue);
    }

    @Test
    public void squareRootOfAValueTest() throws ComplexNumberException {
        double expectedValue = 5;
        double actualValue = calculator.squareRoot(25);
        assertEquals("The expected value is 5", expectedValue, actualValue, 0);
    }

    @Test
    public void squareRootThrowsComplexNumberExceptionTest(){
        double expectedValue = 0;
        double actualValue = 0;
        try{
            calculator.squareRoot(-4);
        }catch(Exception e){
            System.out.println("Complex Number");
        }
        assertEquals("The expected value is 5", expectedValue, actualValue, 0);
    }
}
