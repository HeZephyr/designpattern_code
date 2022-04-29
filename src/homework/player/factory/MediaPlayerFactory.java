package homework.player.factory;

import homework.player.composition.MainWindow;
import homework.player.composition.MediaMainWindow;
import homework.player.composition.MediaPlayerList;
import homework.player.composition.PlayerList;

/**
 * 具体工厂类：MediaPlayerFactory
 * @author Cnc_hzf
 * @date 2022/4/29 20:02
 */
public class MediaPlayerFactory extends PlayerFactory {
    @Override
    public MainWindow createMainWindow() {
        return new MediaMainWindow();
    }

    @Override
    public PlayerList createPlayerList() {
        return new MediaPlayerList();
    }
}
