package com.boris.pattern.model2.two;

// 上下文
// Context用一个ConcentrateStrategy来配置，维护一个对Strategy对象的引用
public class ContextStrategy {
    Strategy strategy;
    // 初始化时，传入具体的策略对象
    public ContextStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    // 上下文接口
    public void contextInterface() {
        strategy.AlgorithmInterface();
    }
}
