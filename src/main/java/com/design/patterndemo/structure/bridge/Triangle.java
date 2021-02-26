package com.design.patterndemo.structure.bridge;

public class Triangle extends Shape{
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("triangle filled with color");
        color.applyColor();
        draw();
    }
}
