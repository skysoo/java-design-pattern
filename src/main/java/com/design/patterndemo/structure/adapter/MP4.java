package com.design.patterndemo.structure.adapter;

public class MP4 implements MediaPlayer{
    @Override
    public void play(String fileName) {
        System.out.println("Playing MP4 File "+fileName);
    }
}
