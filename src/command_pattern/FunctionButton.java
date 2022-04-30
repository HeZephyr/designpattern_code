package command_pattern;
/**
 * 功能键类，充当请求调用者
 * @author Cnc_hzf
 * @date 2022/4/30 14:53
 */
public class FunctionButton {
    private Command command;

    /**
     * 为功能键注入命令
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 点击按钮事件
     */
    public void click() {
        System.out.print("单击功能键：");
        command.execute();
    }
}
