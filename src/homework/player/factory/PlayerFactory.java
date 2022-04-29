package homework.player.factory;

import homework.player.composition.MainWindow;
import homework.player.composition.PlayerList;

/**
 * 抽象工厂类
 * @author Cnc_hzf
 * @date 2022/4/29 19:44
 */
public abstract class PlayerFactory {
    /**
     * 创建主窗口
     * @return 主窗口对象
     */
    public abstract MainWindow createMainWindow();

    /**
     * 创建播放列表
     * @return 播放列表对象
     */
    public abstract PlayerList createPlayerList();
}
