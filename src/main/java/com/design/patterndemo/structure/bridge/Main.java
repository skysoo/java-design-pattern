package com.design.patterndemo.structure.bridge;

/**
 * Adapter 패턴이 서로 다른 인터페이스를 연결해주는 거라면
 * Bridge 패턴은 구현 계층과 기능(추상)계층을 연결해주는 것이다.
 **/
public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new RedColor());
        triangle.applyColor();

        Shape pentagon = new Pentagon(new GreenColor());
        pentagon.applyColor();
    }
}
