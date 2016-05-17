package io.michaelcarroll;


public class Calculator {

    public static int add(int value1, int value2) {
        return value1 + value2;
    }

    public static int subtract(int value1, int value2) {
        return value1 - value2;
    }

    public static int multiply(int value1, int value2) {
        return value1 * value2;
    }

    public static int divide(int value1, int value2) throws DivisionByZeroException {
        if (value2 == 0)
            throw new DivisionByZeroException();
        else
            return value1 / value2;
    }

    public static double squareRoot(double value) throws ComplexNumberException{
        if(value < 0)
            throw new ComplexNumberException();
        else
        return Math.sqrt(value);
    }
}
