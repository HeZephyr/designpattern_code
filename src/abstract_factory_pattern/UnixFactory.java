package abstract_factory_pattern;
/**
 * @author Cnc_hzf
 */
public class UnixFactory implements AbstarctFactory {
    @Override
    public Button createButton() {
        return new UnixButton();
    }
    @Override
    public Text createText() {
        return new UnixText();
    }
}
