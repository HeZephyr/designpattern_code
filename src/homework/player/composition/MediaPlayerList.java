package homework.player.composition;

import homework.player.api.MediaPlayerAPI;

/**
 *
 * @author Cnc_hzf
 * @date 2022/4/29 19:51
 */
public class MediaPlayerList implements PlayerList {
    private MediaPlayerAPI mediaPlayerAPI = new MediaPlayerAPI();
    public MediaPlayerList() {
        this.mediaPlayerAPI = new MediaPlayerAPI();
    }
    @Override
    public void player() {
        mediaPlayerAPI.player();
    }
}
