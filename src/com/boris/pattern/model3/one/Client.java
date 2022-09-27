package com.boris.pattern.model3.one;

public class Client {
    public static void main(String[] args) {
        ConcreteComponent cc = new ConcreteComponent();
        ConcreteDecoratorA ca = new ConcreteDecoratorA();
        ConcreteDecoratorB cb = new ConcreteDecoratorB();

        ca.setComponent(cc);
        cb.setComponent(ca);
        cb.operation();
        /*
          装饰的方法-先用ConcreteComponent实例化对象cc,
          然后用ConcreteDecoratorA的实例化对象ca来包装cc,
          再用cb包装ca，最终执行cb的operation()
        */
    }
}
