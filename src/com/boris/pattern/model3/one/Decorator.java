package com.boris.pattern.model3.one;

public class Decorator extends Component {
    protected Component component;

    // 设置Component
    public void setComponent(Component component) {
        this.component = component;
    }

    // 重写Operation，实际执行的是Component的Operation()
    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
