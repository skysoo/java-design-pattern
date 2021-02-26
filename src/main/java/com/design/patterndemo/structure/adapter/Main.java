package com.design.patterndemo.structure.adapter;

/**
 * Adapter 패턴은 기존 코드의 수정없이 다른 인터페이스의 기능을 사용하고자 할 때 유용하게 사용할 수 있다.
 **/
public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MP3();
        mediaPlayer.play("file.mp3");

        mediaPlayer = new MP4();
        mediaPlayer.play("file.mp4");

        mediaPlayer = new FormatAdapter(new MKV());
        mediaPlayer.play("file.mkv");
    }
}
