package com.design.patterndemo.structure.flyweight;

import lombok.Builder;

public class Line implements Shape {
    private String color;
    private int x;
    private int y;
    private int length;

    @Builder
    public Line(String color, int x, int y, int length) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Line{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", length=" + length +
                '}';
    }
}
