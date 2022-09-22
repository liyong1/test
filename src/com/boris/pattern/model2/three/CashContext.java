package com.boris.pattern.model2.three;

import com.boris.pattern.model2.one.CashNormal;
import com.boris.pattern.model2.one.CashRebate;
import com.boris.pattern.model2.one.CashReturn;
import com.boris.pattern.model2.one.CashSuper;

// 策略模式
public class CashContext {
    private CashSuper cs;
    // 注意参数不是具体的策略对象，而是一个字符串表示收费类型
    public CashContext(String type) {
        // 根据收费类型，实例化策略对象
        switch (type){
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300返100":
                cs = new CashReturn("300","100");
                break;
            case "打8折":
                cs = new CashRebate("0.8");
                break;
        }
    }

    // 获得计算结果
    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}
