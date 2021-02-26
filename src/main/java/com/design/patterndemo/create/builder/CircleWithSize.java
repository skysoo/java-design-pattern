package com.design.patterndemo.create.builder;

public class CircleWithSize implements Shape {
    private int size;

    public CircleWithSize(int size) {
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.println("CircleWithSize draw() Method with size: " + this.size);
    }
}
