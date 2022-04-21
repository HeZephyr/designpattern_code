package factory_method_pattern;
/**
 * @author Cnc_hzf
 */
public interface ImageReaderFactory {
    /**
     * 生成读取图片对象
     * @return 图片对象
     */
    public ImageReader createImageReader();
}
