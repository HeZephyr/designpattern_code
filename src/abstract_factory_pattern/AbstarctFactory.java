package abstract_factory_pattern;
/**
 * @author Cnc_hzf
 */
public interface AbstarctFactory {
    /**
     * 创建Button对象
     * @return Button对象
     */
    Button createButton();

    /**
     * 创建Text对象
     * @return Text对象
     */
    Text createText();
}
