package com.example.demo.anotherDecorator;

public class ColoredShapeDecorator extends ShapeDecorator{

    private Colors color = Colors.NOTSPECIFIED;

    public ColoredShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public void draw() {
        decoratedShape.draw();
        System.out.println("Мой цвет: " + color);
    }
}
