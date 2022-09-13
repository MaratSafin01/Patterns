package com.example.demo.decorator;

public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape triangle = new Triangle();
        Shape redTriangle = new RedShapeDecorator(new Triangle());

        System.out.println("\nОбычный круг");
        circle.draw();

        System.out.println("\nКрасный круг");
        redCircle.draw();

        System.out.println("\nОбычный треугольник");
        triangle.draw();

        System.out.println("\nКрасный треугольник");
        redTriangle.draw();
    }
}
