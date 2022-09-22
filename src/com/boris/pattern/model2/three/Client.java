package com.boris.pattern.model2.three;

// 根据选项，将对应的算法类型字符串传入CashContext中
public class Client {
    public static void main(String[] args) {
        String type = "满300返100";
        CashContext cc = new CashContext(type);
        double money = 300d;
        double result = cc.getResult(money);
        System.out.println(result);
    }
}
