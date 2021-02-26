package com.design.patterndemo.structure.facade;

public class TurnTable implements Switch{
    @Override
    public void on() {
        System.out.println("TurnTable 기동...");
    }

    @Override
    public void off() {
        System.out.println("TurnTable 중지...");
    }
}
