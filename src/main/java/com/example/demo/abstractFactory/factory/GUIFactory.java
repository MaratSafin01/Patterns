package com.example.demo.abstractFactory.factory;

import com.example.demo.abstractFactory.interfaces.Button;
import com.example.demo.abstractFactory.interfaces.Select;
import com.example.demo.abstractFactory.interfaces.TextField;

public interface GUIFactory {

    Button createButton();
    Select createSelect();
    TextField createTextField();
}
