package com.example.demo.anotherDecorator;

public class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Я треугольник");
    }
}
