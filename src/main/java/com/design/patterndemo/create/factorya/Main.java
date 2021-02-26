package com.design.patterndemo.create.factorya;

import com.design.patterndemo.create.factorya.factory.ComputerFactory;

/**
 * 팩토리 메소드 패턴
 * = 조건에 따른 객체 생성을 팩토리 클래스로 위임하여 팩토리 클래스에서 객체를 생성하는 패턴
 *
 * @see ComputerFactory#createComputer(Brand)
 **/
public class Main {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        computerFactory.createComputer(Brand.SAMSUNG);
    }
}
