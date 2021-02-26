package com.design.patterndemo.create.singleton;

/**
 *
 * 1. 초기화를 객체 생성 시점에 바로 진행하는 방법
 *
 * 멀티스레드 환경에서도 잘 동작하는 싱글턴 패턴
 **/
public class Singleton2 {
    private static Singleton2 singleton2 = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getSingleton2() {
        return singleton2;
    }

    public void print(String string) {
        System.out.println(string);
    }
}
