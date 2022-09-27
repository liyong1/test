package com.boris.pattern.model3.one;

public class ConcreteDecoratorB extends Decorator{
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    public void addedBehavior() {
        // 本类独有的方法，区别于其他类

    }
}
