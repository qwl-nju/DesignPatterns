package com.qwl.factory;

import com.qwl.simplefactory.Operation;
import com.qwl.simplefactory.SubOperation;

public class SubOperationFactory implements OperationFactory{
    @Override
    public Operation createOperation() {
        return new SubOperation();
    }
}
