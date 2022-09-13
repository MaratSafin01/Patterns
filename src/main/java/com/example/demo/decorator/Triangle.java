package com.example.demo.decorator;

public class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Я треугольник!");
    }
}
