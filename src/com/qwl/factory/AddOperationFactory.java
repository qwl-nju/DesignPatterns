package com.qwl.factory;

import com.qwl.simplefactory.AddOperation;
import com.qwl.simplefactory.Operation;

public class AddOperationFactory implements OperationFactory {
    @Override
    public Operation createOperation() {
        return new AddOperation();
    }
}
