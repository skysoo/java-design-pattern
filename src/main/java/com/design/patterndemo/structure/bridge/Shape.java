package com.design.patterndemo.structure.bridge;

// 기능 정의
public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("그리기 시작");
    }

    abstract public void applyColor();
}
