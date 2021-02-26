package com.design.patterndemo.create.singleton;

/**
 *
 * 2. 객체 생성 로직에 synchronized() 적용하는 방법
 *
 * 멀티스레드 환경에서도 잘 동작하는 싱글턴 패턴
 *
 * JVM 내에 클래스 객체는 클래스 당 하나만 존재할 수 있으므로 같은 클래스에 대해서는
 * 오직 한 스레드만 동기화된 static 메소드를 실행할 수 있다.
 *
 * 즉, 아래와 같이 동기화된 static 메소드가 2개 이상일 때, 2개의 스레드가 각각 동기화된 처리를 하는 것이 아니라
 * 클래스 당 하나의 스레드가 하나의 작업을 수행한다는 것이다.
 **/
public class Singleton3 {
    private static Singleton3 singleton3 = null;

    private Singleton3() {
    }

    public synchronized static Singleton3 getsingleton3() {
        if (singleton3 == null) {
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
    
    public synchronized static void setsingleton3() {
        singleton3 = new Singleton3();
    }

    public void print(String string) {
        synchronized (this) {
            System.out.println(string);
        }
    }
}
