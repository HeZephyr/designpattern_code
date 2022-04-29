package homework.player.composition;

import homework.player.api.RealPlayerAPI;

/**
 * @author Cnc_hzf
 * @date 2022/4/29 19:54
 */
public class RealMainWindow implements MainWindow {
    private RealPlayerAPI realPlayerAPI;
    public RealMainWindow() {
        this.realPlayerAPI = new RealPlayerAPI();
    }
    @Override
    public void window() {
        realPlayerAPI.window();
    }
}
