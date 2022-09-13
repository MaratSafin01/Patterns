package com.example.demo.abstractFactory.factory;

import com.example.demo.abstractFactory.impl.MacButton;
import com.example.demo.abstractFactory.impl.MacSelect;
import com.example.demo.abstractFactory.impl.MacTextField;
import com.example.demo.abstractFactory.interfaces.Button;
import com.example.demo.abstractFactory.interfaces.Select;
import com.example.demo.abstractFactory.interfaces.TextField;

public class MacGUIFactory implements GUIFactory{

    public MacGUIFactory() {
        System.out.println("MacGUIFactory created!");
    }

    @Override
    public Button createButton() {
        System.out.println("Mac button created");
        return new MacButton();
    }

    @Override
    public Select createSelect() {
        System.out.println("Mac select created");
        return new MacSelect();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Mac text field created");
        return new MacTextField();
    }
}
