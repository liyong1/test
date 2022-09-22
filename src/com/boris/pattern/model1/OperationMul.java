package com.boris.pattern.model1;

public class OperationMul extends Operation{
    @Override
    public Double getResult() {
        return getNumberA() * getNumberB();
    }
}
