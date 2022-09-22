package com.boris.pattern.model1;

public class Client {
    public static void main(String[] args) {
        Operation operation;
        operation = OperationFactory.createOperation("/");
        operation.setNumberA(1.0);
        operation.setNumberB(3.0);
        try {
            Double result = operation.getResult();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
