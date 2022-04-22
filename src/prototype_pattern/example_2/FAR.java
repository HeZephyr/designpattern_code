package prototype_pattern.example_2;
/**
 * 可行性分析报告（Feasibility Analysis Report）类
 * @author Cnc_hzf
 * @date 2022/4/22 16:48
 */
public class FAR implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try {
            far = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制");
        }
        return far;
    }
    @Override
    public void display() {
        System.out.println("《可行性分析报告》");
    }
}
