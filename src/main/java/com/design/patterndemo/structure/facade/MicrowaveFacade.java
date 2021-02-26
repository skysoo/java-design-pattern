package com.design.patterndemo.structure.facade;

public class MicrowaveFacade {
    private final Cooler cooler;
    private final Magnetron magnetron;
    private final TimerChecker timerChecker;
    private final TurnTable turnTable;
    Switch[] switches;
    boolean isActive = false;

    public MicrowaveFacade(Mode mode) {
        super();
        cooler = new Cooler();
        magnetron = new Magnetron();
        timerChecker = new TimerChecker(mode.getValue(), this);
        turnTable = new TurnTable();
        switches = new Switch[] {cooler, magnetron, timerChecker, turnTable};
    }

    public void on(){
        for (int i = 0; i < switches.length; i++) {
            switches[i].on();
        }
        isActive = true;
    }

    public void off(){
        for (int i = 0; i < switches.length; i++) {
            switches[i].off();
        }
        isActive = false;
    }
}
