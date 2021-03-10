package com.design.patterndemo.structure.proxy;

public class CommandExecutorProxy implements CommandExecutor{
    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd) {
        if("soo".equals(user) && "1234".equals(pwd)){
            isAdmin = true;
        }
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            executor.runCommand("[admin] "+cmd);
        } else {
            if (cmd.trim().startsWith("rm")){
                throw new Exception("rm is only admin");
            } else {
                executor.runCommand(cmd);
            }
        }
    }
}
