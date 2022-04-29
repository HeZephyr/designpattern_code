package homework.player.composition;

import homework.player.api.MediaPlayerAPI;

/**
 * @author Cnc_hzf
 * @date 2022/4/29 19:53
 */
public class MediaMainWindow implements MainWindow{
    private MediaPlayerAPI mediaPlayerAPI;
    public MediaMainWindow() {
        this.mediaPlayerAPI = new MediaPlayerAPI();
    }
    @Override
    public void window() {
        mediaPlayerAPI.window();
    }
}
