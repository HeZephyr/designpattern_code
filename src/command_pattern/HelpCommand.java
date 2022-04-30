package command_pattern;
/**
 * 帮助命令类，充当具体命令类
 * @author Cnc_hzf
 * @date 2022/4/30 15:00
 */
public class HelpCommand extends Command {
    private DisplayHelpClass hcObj;

    public HelpCommand() {
        hcObj = new DisplayHelpClass();
    }

    @Override
    public void execute() {
        hcObj.display();
    }
}
