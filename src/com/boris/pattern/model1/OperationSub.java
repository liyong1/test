package com.boris.pattern.model1;

public class OperationSub extends Operation{
    @Override
    public Double getResult() {
        return getNumberA() - getNumberB();
    }
}
