package com.boris.pattern.model1;

// 运算类
// 在OperationFactory中根据不同的operation(+-*/)生产不同的Operation子类
public class Operation {
    private Double numberA = Double.valueOf(0);
    private Double numberB = Double.valueOf(0);

    public Double getNumberA(){
        return numberA;
    }
    public Double getNumberB(){
        return numberB;
    }

    public void setNumberA(Double numberA) {
        this.numberA = numberA;
    }
    public void setNumberB(Double numberB) {
        this.numberB = numberB;
    }

    public Double getResult() throws Exception {
        return Double.valueOf(0);
    }
}
