package com.design.patterndemo.structure.flyweight;

import lombok.Builder;

public class Circle implements Shape{
    private String color;
    private int x;
    private int y;
    private int radius;

    @Builder
    public Circle(String color, int x, int y, int radius) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }
}
