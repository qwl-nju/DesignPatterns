package com.qwl.simplefactory;

public class SubOperation extends Operation{
    public SubOperation() {
    }

    public SubOperation(double a, double b) {
        super(a, b);
    }

    @Override
    public double operate(double a, double b) {
        return a - b;
    }
}
