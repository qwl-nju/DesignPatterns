package com.qwl.strategy;

import com.qwl.simplefactory.AddOperation;
import com.qwl.simplefactory.Operation;
import com.qwl.simplefactory.SubOperation;

public class Context {

    Operation operation = null;

    public Context(String operate) {

        switch (operate) {
            case "+":
                this.operation = new AddOperation();
                break;
            case "-":
                this.operation = new SubOperation();
                break;
        }
    }

    public double getResult(double a, double b) {
        return operation.operate(a, b);
    }
}
