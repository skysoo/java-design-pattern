package com.design.patterndemo.structure.adapter;

/**
 * 다른 인터페이스의 구현 클래스를 주입 받아서 변환하려는 인터페이스의 기능에 집어 넣어서 사용하는 것이 이 패턴의 핵심이다.
 **/
public class FormatAdapter implements MediaPlayer{
    private MediaPackage mediaPackage;

    public FormatAdapter(MediaPackage m){
        this.mediaPackage = m;
    }

    @Override
    public void play(String fileName) {
        System.out.println("Using Adapter --> ");
        mediaPackage.playFile(fileName);
    }
}
