package com.design.patterndemo.structure.facade;

import lombok.Getter;

public enum  Mode {
    FAST(5000,"FAST_MODE"),
    SLOW(10000, "SLOW_MODE");

    int value;
    String name;

    Mode(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
