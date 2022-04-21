package factory_method_pattern;
/**
 * @author Cnc_hzf
 */
public class JpgReader implements ImageReader {
    @Override
    public void readImage() {
        System.out.println("读取Jpg格式的图片");
    }
}
