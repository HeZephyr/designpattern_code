package factory_method_pattern;
/**
 * @author Cnc_hzf
 */
public class Test {
    public static void main(String[] args) {
        ImageReaderFactory imageReaderFactory;
        ImageReader imageReader;
        imageReaderFactory = (ImageReaderFactory) XMLUtils.getBean();
        imageReader = imageReaderFactory.createImageReader();
        imageReader.readImage();
    }
}
