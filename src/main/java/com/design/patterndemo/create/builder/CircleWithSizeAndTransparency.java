package com.design.patterndemo.create.builder;

public class CircleWithSizeAndTransparency implements Shape {
    private int size;
    private boolean transparency;

    public CircleWithSizeAndTransparency(int size, boolean transparency) {
        this.size = size;
        this.transparency = transparency;
    }

    @Override
    public void draw() {
        System.out.println("CircleWithSizeAndTransparency draw() Method with size: "+ this.size +" transparency: "+this.transparency);
    }
}
