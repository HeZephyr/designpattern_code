package abstract_factory_pattern;
/**
 * @author Cnc_hzf
 */
public class WindowsButton implements Button {
    @Override
    public void clickButton() {
        System.out.println("点击了WindowsButton！");
    }
}
