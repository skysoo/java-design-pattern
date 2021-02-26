package com.design.patterndemo.create.builder;

/**
 * Factory 메소드 패턴에 빌더 패턴을 적용하면 다음과 같은 장점을 가질 수 있다.
 *
 * 1. 필수 값인 name 속성은 생성자로 받고, Optional 한 값인 size 와 isTransparency 는 메소드를 통해 선택적으로 입력할 수있다.
 * 2. 위 효과로 팩토리 클래스로 많은 파라미터를 넘겨줄 때 타입, 순서 등을 고려할 필요가 없어진다.
 * 3. 경우에 따라 필요없는 파라미터에 대해 일일히 null 을 넘겨 줄 필요가 없다.
 * 4. 생성해야 하는 sub class 가 무거워지거나 복잡해지는 것을 방지한다.
 **/
public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory.ShapeFactoryBuilder("Small Shape")
                .setSize(10)
                .setIsTransparency(true)
                .build();
        try {
            Shape shape = factory.createShape();
            shape.draw();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
