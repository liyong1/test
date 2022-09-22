package com.boris.pattern.model2.one;

// 返利收费子类
public class CashReturn extends CashSuper{
    // 初始化必须要入返利条件和返利值
    private final double moneyCondition;
    private final double moneyReturn;
    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        // 若大于返利条件，则需要减去返利值
        if(money >= moneyCondition) {
            result = money - Math.floor(money/moneyCondition)*moneyReturn;
        }
        return result;
    }
}
