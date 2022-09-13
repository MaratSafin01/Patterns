package com.example.demo.decorator;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Я круг!");
    }
}
