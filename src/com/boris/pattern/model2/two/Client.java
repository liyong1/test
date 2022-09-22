package com.boris.pattern.model2.two;

// 策略模式
// 定义了算法家族，分别封装起来，让其相互之间替换，使算法的变化不影响使用算法的用户
// 封装变化点
public class Client {
    // 由于实例化不同的策略，所以最终在调用contextInterface时所获得结果不同
    public static void main(String[] args) {
        ContextStrategy contextStrategy;

        contextStrategy = new ContextStrategy(new ConcreteStrategyA());
        contextStrategy.contextInterface();

        contextStrategy = new ContextStrategy(new ConcreteStrategyB());
        contextStrategy.contextInterface();

        contextStrategy = new ContextStrategy(new ConcreteStrategyC());
        contextStrategy.contextInterface();
    }
}
