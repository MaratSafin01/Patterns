package com.example.demo.abstractFactory.factory;

import com.example.demo.abstractFactory.impl.WindowsButton;
import com.example.demo.abstractFactory.impl.WindowsSelect;
import com.example.demo.abstractFactory.impl.WindowsTextField;
import com.example.demo.abstractFactory.interfaces.Button;
import com.example.demo.abstractFactory.interfaces.Select;
import com.example.demo.abstractFactory.interfaces.TextField;

public class WindowsGUIFactory implements GUIFactory {
    public WindowsGUIFactory() {
        System.out.println("WindowsGUIFactory created!");
    }

    @Override
    public Button createButton() {
        System.out.println("Windows button created!");
        return new WindowsButton();
    }

    @Override
    public Select createSelect() {
        System.out.println("Windows select created!");
        return new WindowsSelect();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Windows text field created!");
        return new WindowsTextField();
    }


}
