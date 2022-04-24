package bridge_pattern;
/**
 * 具体实现类：从SQLServer数据库中读取数据
 * @author Cnc_hzf
 * @date 2022/4/24 20:51
 */
public class SQLServerHandle implements DataHandler {
    @Override
    public void readData() {
        System.out.println("从SQLServer数据库中读取数据");
    }
}
