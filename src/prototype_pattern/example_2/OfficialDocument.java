package prototype_pattern.example_2;

/**
 * 抽象公文对象
 * @author Cnc_hzf
 */
public interface OfficialDocument extends Cloneable {
    /**
     * 克隆方法
     * @return OfficialDocument 对象
     */
    public OfficialDocument clone();

    /**
     * 打印信息
     */
    public void display();
}
