package com.design.patterndemo.structure.proxy;

/**
 * @see CommandExecutorImpl#runCommand(String)
 *
 * 위 메서드에 대한 수정이 불가하다고 가정할 때, 권한을 추가하는 등의 작업을 하고 싶다면
 * 프록시 패턴으로 메인 작업의 수정 없이
 *
 * @see CommandExecutorProxy
 *
 * 위 클래스에서 권한 처리 후 CommandExecutorImpl 의 작업을 수행하도록 로직을 구성할 수 있다.
 **/
public class Main {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("soo1", "1234");

        try {
            executor.runCommand("ls -al");
            executor.runCommand("rm -rf *");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
