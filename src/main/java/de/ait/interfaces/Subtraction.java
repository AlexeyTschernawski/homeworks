package de.ait.interfaces;

public class Subtraction  implements Operation{
    @Override
    public double execute(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }
}
