package com.example.demo.abstractFactory;

import com.example.demo.abstractFactory.factory.GUIFactory;
import com.example.demo.abstractFactory.factory.MacGUIFactory;
import com.example.demo.abstractFactory.factory.WindowsGUIFactory;

public class Application {
    private OrderCoffeeForm orderCoffeeForm;

    public void drawOrderCoffeeFrom() {
        String osName = System.getProperty("os.name").toLowerCase();
        GUIFactory guiFactory;

        if (osName.startsWith("win")) {
            guiFactory = new WindowsGUIFactory();
        } else if (osName.startsWith("mac")) {
            guiFactory = new MacGUIFactory();
        } else {
            System.out.println("Unknown OC - type((9( ");
            return;
        }
        orderCoffeeForm = new OrderCoffeeForm(guiFactory);
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.drawOrderCoffeeFrom();
    }
}
