package homework.oa_system;
/**
 * 客户端测试类
 * @author Cnc_hzf
 * @date 2022/4/29 21:20
 */
public class Client {
    public static void main(String[] args) {
        Institution unit0, unit1, unit2, unit3;
        Office unit4, unit5;
        unit0 = new Institution("北京总部");
        unit1 = new Institution("湖南分校");
        unit2 = new Institution("长沙教学点");
        unit3 = new Institution("湘潭教学点");
        unit4 = new Office("教务办公室");
        unit5 = new Office("行政办公室");

        unit2.add(unit4);
        unit2.add(unit5);

        unit3.add(unit4);
        unit3.add(unit5);

        unit1.add(unit4);
        unit1.add(unit5);
        unit1.add(unit2);
        unit1.add(unit3);

        unit0.add(unit4);
        unit0.add(unit5);
        unit0.add(unit1);

        unit0.handArchives();
    }
}
