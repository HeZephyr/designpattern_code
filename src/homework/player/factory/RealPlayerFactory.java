package homework.player.factory;

import homework.player.composition.MainWindow;
import homework.player.composition.PlayerList;
import homework.player.composition.RealMainWindow;
import homework.player.composition.RealPlayerList;

/**
 * 具体工厂类：RealPlayerFactory
 * @author Cnc_hzf
 * @date 2022/4/29 20:05
 */
public class RealPlayerFactory extends PlayerFactory {
    @Override
    public MainWindow createMainWindow() {
        return new RealMainWindow();
    }

    @Override
    public PlayerList createPlayerList() {
        return new RealPlayerList();
    }
}
