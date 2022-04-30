package command_pattern;
/**
 * 退出命令类，充当具体命令类
 * @author Cnc_hzf
 * @date 2022/4/30 14:56
 */
public class ExitCommand extends Command {
    private SystemExitClass seObj;

    public ExitCommand() {
        seObj = new SystemExitClass();
    }
    @Override
    public void execute() {
        seObj.exit();
    }
}
