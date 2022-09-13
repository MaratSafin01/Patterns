package com.example.demo.proxy;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();

    }
}
