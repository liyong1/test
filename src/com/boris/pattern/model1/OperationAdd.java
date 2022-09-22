package com.boris.pattern.model1;

public class OperationAdd extends Operation{
    @Override
    public Double getResult() {
        return getNumberA() + getNumberB();
    }
}
