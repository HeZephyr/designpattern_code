package prototype_pattern.example_2;
/**
 * 测试
 * @author Cnc_hzf
 * @date 2022/4/22 17:01
 */
public class Client {
    public static void main(String[] args) {
        // 获取原型管理器对象
        PrototypeManager prototypeManager = PrototypeManager.getPrototypeManager();

        OfficialDocument officialDocument1, officialDocument2, officialDocument3, officialDocument4;

        officialDocument1 = prototypeManager.getOfficialDocument("FAR");
        officialDocument1.display();
        officialDocument2 = prototypeManager.getOfficialDocument("FAR");
        officialDocument2.display();
        System.out.println(officialDocument1 == officialDocument2);

        officialDocument3 = prototypeManager.getOfficialDocument("SRS");
        officialDocument3.display();
        officialDocument4 = prototypeManager.getOfficialDocument("SRS");
        officialDocument4.display();
        System.out.println(officialDocument3 == officialDocument4);
    }
}
