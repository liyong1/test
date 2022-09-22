package com.boris.pattern.model2.two;

// 封装具体的算法或行为
public class ConcreteStrategyA extends Strategy{
    @Override
    public void AlgorithmInterface() {
        System.out.println("封装算法A实现方法");
    }
}
