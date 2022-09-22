package com.boris.pattern.model1;

public class OperationFactory {
    public static Operation createOperation(String opeStr) {
        Operation operation = null;
        switch (opeStr) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}
