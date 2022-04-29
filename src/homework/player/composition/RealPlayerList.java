package homework.player.composition;

import homework.player.api.RealPlayerAPI;

/**
 * @author Cnc_hzf
 * @date 2022/4/29 19:52
 */
public class RealPlayerList implements PlayerList {
    private RealPlayerAPI realPlayerAPI = new RealPlayerAPI();
    public RealPlayerList() {
        this.realPlayerAPI = new RealPlayerAPI();
    }
    @Override
    public void player() {
        realPlayerAPI.player();
    }
}
