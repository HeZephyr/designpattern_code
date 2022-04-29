package homework.player;

import homework.player.utils.XMLUtils;
import homework.player.composition.MainWindow;
import homework.player.composition.PlayerList;
import homework.player.factory.PlayerFactory;

/**
 * 客户端测试类
 * @author Cnc_hzf
 * @date 2022/4/29 20:07
 */
public class Client {
    public static void main(String[] args) {
        PlayerFactory playerFactory;
        MainWindow mainWindow;
        PlayerList playerList;
        playerFactory = (PlayerFactory) XMLUtils.getBean();
        mainWindow = playerFactory.createMainWindow();
        playerList = playerFactory.createPlayerList();
        mainWindow.window();
        playerList.player();
    }
}
