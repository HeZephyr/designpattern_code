package command_pattern;
/**
 * 客户端测试类
 * @author Cnc_hzf
 * @date 2022/4/30 15:03
 */
public class Client {
    public static void main(String[] args) {
        FunctionButton functionButton = new FunctionButton();
        // 定义命令对象
        Command command;
        command = (Command) XMLUtils.getBean();

        // 将命令对象注入功能键
        functionButton.setCommand(command);
        functionButton.click();
    }
}
