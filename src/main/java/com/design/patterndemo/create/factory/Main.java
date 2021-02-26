package com.design.patterndemo.create.factory;

/**
 * Factory Method 패턴은 객체의 생성 및 관리를 하위 클래스(Factory)로 위임함으로써 가지는 아래와 같은 장점을 누리고자 이용한다.
 *
 * 1. 객체 생성을 팩토리 메소드에서 진행하므로 보다 자유롭고 용도에 맞는 네이밍 적용 가능 -
 * 2. 팩토리 클래스에서 생성되는 객체의 동일한 기능 구현을 강제할 수 있다.
 * 3. 객체 생성자의 접근 지정자를 지정함으로써 은닉성 확보할 수 있다.
 **/
public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        try {
            for (int i = 0; i < 10; i++) {
                Shape shape = factory.createShape("CIRCLE");
                shape.draw();
            }

//            shape = factory.createShape("RECTANGLE");
//            shape.draw();
//
//            shape = factory.createShape("SQUARE");
//            shape.draw();
//
//            shape = factory.createShape("HALF-CIRCLE");
//            shape.draw();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
