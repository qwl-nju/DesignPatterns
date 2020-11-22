package com.qwl.simplefactory;

public class AddOperation extends Operation{
    public AddOperation(double a, double b) {
        super(a, b);
    }

    public AddOperation() {
    }

    @Override
    public double operate(double a, double b) {
        return a + b;
    }
}
