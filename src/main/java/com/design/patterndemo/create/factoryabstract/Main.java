package com.design.patterndemo.create.factoryabstract;

import com.design.patterndemo.create.factoryabstract.factory.ComputerFactory;

/**
 * 추상 팩토리 메소드
 * = 서로 관련이 있는 객체들을 통으로 묶어서 팩토리 클래스를 만들고, 이들 팩토리를 조건에 따라 생성하도록 다시 팩토리를 만들어서 객체를 생성하는 패턴
 *
 *
 * @see ComputerFactory#createComputer(Brand)
 **/
public class Main {

    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        computerFactory.createComputer(Brand.SAMSUNG);
    }
}
