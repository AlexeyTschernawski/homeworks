package de.ait.interfaces;

public class Multiplication implements Operation{
    @Override
    public double execute(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }
}
