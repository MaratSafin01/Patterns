package com.example.demo.abstractFactory;

import com.example.demo.abstractFactory.factory.GUIFactory;
import com.example.demo.abstractFactory.interfaces.Button;
import com.example.demo.abstractFactory.interfaces.Select;
import com.example.demo.abstractFactory.interfaces.TextField;

public class OrderCoffeeForm {
    private final TextField customerNameTextField;
    private final Select coffeeTypeSelect;
    private final Button orderButton;

    public OrderCoffeeForm(GUIFactory guiFactory) {
        System.out.println("Creating order coffee form...");
        this.customerNameTextField = guiFactory.createTextField();
        this.coffeeTypeSelect = guiFactory.createSelect();
        this.orderButton = guiFactory.createButton();
        System.out.println("Order coffee form is created!");
    }
}
