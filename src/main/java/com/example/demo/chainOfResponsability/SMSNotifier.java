package com.example.demo.chainOfResponsability;

public class SMSNotifier extends Notifier{


    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending sms to manager: " + message);
    }
}
