package com.example.demo.proxy;

public class ExpensiveObjectImpl implements ExpensiveObject {

    public ExpensiveObjectImpl() throws InterruptedException {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        System.out.println("Processing complete");
    }

    private void heavyInitialConfiguration() throws InterruptedException {
        System.out.println("Loading initial configuration...");
        Thread.sleep(3000);
    }
}
