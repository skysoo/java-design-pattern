package com.design.patterndemo.structure.facade;

import java.util.Timer;
import java.util.TimerTask;

public class TimerChecker implements Switch{
    private static long TIME_INTERVAL = 1000;
    private final int EXPIRED_TIME;
    private Timer timer;
    private TimerTask timerTask;
    int count = 0;
    MicrowaveFacade microwaveFacade;

    public TimerChecker(int millsec, MicrowaveFacade microwaveFacade) {
        super();
        this.EXPIRED_TIME = millsec;
        this.count = EXPIRED_TIME/1000;
        timer = new Timer();
        this.microwaveFacade = microwaveFacade;
        timerTask = new TimerTask() {
            @Override
            public void run() {
                if (count> 0){
                    System.out.println("Timer.. "+(count--) + " 초");
                } else {
                    System.out.println("조리가 완료되었습니다.");
                    timer.cancel();
                    microwaveFacade.off();
                }
            }
        };
    }

    @Override
    public void on() {
        timer.schedule(timerTask, 0, TIME_INTERVAL);
    }

    @Override
    public void off() {
        timer.cancel();
    }
}
