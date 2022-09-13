package com.example.demo.anotherDecorator;

public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        ColoredShapeDecorator circleDecorator = new ColoredShapeDecorator(new Circle());
        ColoredShapeDecorator triangleDecorator = new ColoredShapeDecorator(new Triangle());

        circle.draw();
        triangle.draw();

        circleDecorator.draw();
        circleDecorator.setColor(Colors.BLUE);
        circleDecorator.draw();

        triangleDecorator.draw();
        triangleDecorator.setColor(Colors.BLACK);
        triangleDecorator.draw();

    }
}
