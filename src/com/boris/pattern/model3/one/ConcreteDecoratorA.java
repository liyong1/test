package com.boris.pattern.model3.one;

public class ConcreteDecoratorA extends Decorator{
    // 本类独有的功能
    private String addedState;

    public void operation() {
        // 先运行原Component的operation()，再执行本类的功能，如对原Component装饰
        super.operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
