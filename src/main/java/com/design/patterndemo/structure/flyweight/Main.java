package com.design.patterndemo.structure.flyweight;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        for (int i = 0; i < 10; i++) {
            Shape shape = factory.getShape(ShapeType.CIRCLE);
            shape.draw();
        }
    }
}
