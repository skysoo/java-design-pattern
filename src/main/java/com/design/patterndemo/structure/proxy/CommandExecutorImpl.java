package com.design.patterndemo.structure.proxy;

public class CommandExecutorImpl implements CommandExecutor{
    @Override
    public void runCommand(String cmd) throws Exception {
        // 높은 cost 의 작업이 필요하다고 가정
//        Runtime.getRuntime().exec(cmd);
        System.out.println("cmd: "+cmd);
    }
}
