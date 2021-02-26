package com.design.patterndemo.structure.facade;

public class Cooler implements Switch{

    @Override
    public void on() {
        System.out.println("쿨러 작동 시작...");
    }

    @Override
    public void off() {
        System.out.println("쿨러 작동 중지...");
    }
}
