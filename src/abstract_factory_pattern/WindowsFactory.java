package abstract_factory_pattern;
/**
 * @author Cnc_hzf
 */
public class WindowsFactory implements AbstarctFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    @Override
    public Text createText() {
        return new WindowsText();
    }
}
