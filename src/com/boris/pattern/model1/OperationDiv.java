package com.boris.pattern.model1;

public class OperationDiv extends Operation{
    @Override
    public Double getResult() throws Exception {
        if(getNumberB() == 0) {
            throw new Exception("除数不能为0.");
        }
        return getNumberA() / getNumberB();
    }
}
