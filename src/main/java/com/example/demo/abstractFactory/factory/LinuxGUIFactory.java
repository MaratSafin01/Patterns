package com.example.demo.abstractFactory.factory;

import com.example.demo.abstractFactory.impl.LinuxButton;
import com.example.demo.abstractFactory.impl.LinuxSelect;
import com.example.demo.abstractFactory.impl.LinuxTextField;
import com.example.demo.abstractFactory.interfaces.Button;
import com.example.demo.abstractFactory.interfaces.Select;
import com.example.demo.abstractFactory.interfaces.TextField;

public class LinuxGUIFactory implements GUIFactory{
    public LinuxGUIFactory() {
        System.out.println("LinuxGUIFactory created!");
    }

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Select createSelect() {
        return new LinuxSelect();
    }

    @Override
    public TextField createTextField() {
        return new LinuxTextField();
    }
}
