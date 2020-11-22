package com.qwl.simplefactory;

public class OperationFactor {
    public static Operation createOperation(String operate) {

        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new AddOperation();
            case "-":
                operation = new SubOperation();
        }
        return operation;

    }
}
