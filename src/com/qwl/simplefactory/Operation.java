package com.qwl.simplefactory;

public abstract class Operation {
    public Operation() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Operation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    private double a;
    private double b;

    public abstract double operate(double a, double b);
}
