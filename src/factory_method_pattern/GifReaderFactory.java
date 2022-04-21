package factory_method_pattern;
/**
 * @author Cnc_hzf
 */
public class GifReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader createImageReader() {
        ImageReader gifReader = new GifReader();
        return gifReader;
    }
}
