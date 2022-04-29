package homework.oa_system;

/**
 * 办公室类
 * @author Cnc_hzf
 * @date 2022/4/29 21:14
 */
public class Office extends Unit {
    private String name;
    public Office(String name) {
        this.name = name;
    }
    @Override
    public void handArchives() {
        System.out.println("------------给" + name + "下发了公文！------------");
    }
}
