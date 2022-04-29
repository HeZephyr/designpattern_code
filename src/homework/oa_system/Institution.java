package homework.oa_system;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器构件角色
 * @author Cnc_hzf
 * @date 2022/4/29 21:16
 */
public class Institution extends Unit {
    private List<Unit> list = new ArrayList();
    String name;
    public Institution(String name) {
        this.name = name;
    }

    /**
     * 添加角色
     * @param unit
     */
    public void add(Unit unit) {
        list.add(unit);
    }
    @Override
    public void handArchives() {
        System.out.println("************给" + name + "下发了公文************");
        for (Unit unit : list) {
            unit.handArchives();
        }
    }

}
