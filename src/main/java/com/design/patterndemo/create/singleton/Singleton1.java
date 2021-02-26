package com.design.patterndemo.create.singleton;

import javax.annotation.concurrent.NotThreadSafe;

/**
 * 잘 못된 싱글턴 패턴
 *
 * 클래스 객체의 초기화 단계에서 멀티스레드 환경에서 오작동할 수 있다.
 **/
@NotThreadSafe
public class Singleton1 {
    private static Singleton1 singleton1 = null;
    private Singleton1() {}

    public static Singleton1 getSingleton1() {
        if (singleton1 == null){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

    public void print(String string){
        System.out.println(string);
    }
}
