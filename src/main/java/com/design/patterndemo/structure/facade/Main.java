package com.design.patterndemo.structure.facade;

/**
 * 퍼사드 패턴은 다양한 서브 시스템이 존재하는 상황에서 서브 클래스들을 캡슐화하고 퍼사드 클래스 외의 서브 시스템들을 추상화
 * 하여 시스템 결합도를 낮춤으로써 관리 포인트를 크게 줄일 수 있다.
 *
 * 퍼사드 클래스 - MicrowaveFacade
 *
 * 서브 시스템 - Cooler, Magnetron, TimerChecker, TurnTable
 **/
public class Main {
    public static void main(String[] args) {
        MicrowaveFacade microwaveFacade = new MicrowaveFacade(Mode.FAST);
        microwaveFacade.on();
    }
}
