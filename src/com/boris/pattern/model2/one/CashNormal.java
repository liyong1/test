package com.boris.pattern.model2.one;

// 正常收费子类
public class CashNormal extends CashSuper{
    @Override
    public double acceptCash(double money) {
        // 正常收费，原价返回
        return money;
    }
}
