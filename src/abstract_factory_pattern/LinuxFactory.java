package abstract_factory_pattern;
/**
 * @author Cnc_hzf
 */
public class LinuxFactory implements AbstarctFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }
    @Override
    public Text createText() {
        return new LinuxText();
    }
}
