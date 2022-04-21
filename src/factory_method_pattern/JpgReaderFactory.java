package factory_method_pattern;
/**
 * @author Cnc_hzf
 */
public class JpgReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader createImageReader() {
        ImageReader jpgReader = new JpgReader();
        return jpgReader;
    }
}
