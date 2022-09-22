package com.boris.pattern.model2.one;

// 折扣收费子类
public class CashRebate extends CashSuper{
    private final double moneyRebate;
    // 打折收费，初始化必须输入折扣率
    public CashRebate(String moneyRebate){
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }
    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
