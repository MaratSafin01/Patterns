package com.example.demo.proxy;

public class ExpensiveObjectProxy implements ExpensiveObject{

    private static ExpensiveObject object;

    @Override
    public void process() throws InterruptedException {
        if (object == null) {
            object = new ExpensiveObjectImpl();
        }
        object.process();
    }
}
