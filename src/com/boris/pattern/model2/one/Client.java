package com.boris.pattern.model2.one;

// 客户端
public class Client {

    public static void main(String[] args) {

        // 满300返100
        // 打8折
        String select = "正常收费";
        // 利用简单工厂模式根据下拉框选项，生产相应对象
        CashSuper cs = CashFactory.createCashAccept(select);
        double price = 100d;
        double total = cs.acceptCash(price);
        System.out.println(total);
    }
}
