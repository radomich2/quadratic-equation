package org.example.v2;

/**
 * Parameters a,b,c of a quadratic equation [ax^2 + bx + c = 0]
 */
public class Parameters {
    private double a;
    private double b;
    private double c;

    public Parameters(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
