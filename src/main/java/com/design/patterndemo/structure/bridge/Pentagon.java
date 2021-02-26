package com.design.patterndemo.structure.bridge;

public class Pentagon extends Shape{
    public Pentagon(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("pentagon filled with color");
        color.applyColor();
        draw();
    }
}
