package abstract_factory_pattern;
/**
 * @author Cnc_hzf
 */
public class Test {
    public static void main(String[] args) {
        AbstarctFactory factory = (AbstarctFactory) XMLUtils.getBean();
        Button button = factory.createButton();
        Text text = factory.createText();
        button.clickButton();
        text.showText();
    }
}
