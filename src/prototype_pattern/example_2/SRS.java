package prototype_pattern.example_2;
/**
 * 软件需求规格说明书（Software Requirements Specification）类
 * @author Cnc_hzf
 * @date 2022/4/22 16:51
 */
public class SRS implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument srs = null;
        try {
            srs = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制");
        }
        return srs;
    }

    @Override
    public void display() {
        System.out.println("《软件需求规格说明书》");
    }
}
