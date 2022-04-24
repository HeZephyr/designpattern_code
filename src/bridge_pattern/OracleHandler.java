package bridge_pattern;
/**
 * 具体实现类角色：从Oracle数据库中读取数据
 * @author Cnc_hzf
 * @date 2022/4/24 20:46
 */
public class OracleHandler implements DataHandler {
    @Override
    public void readData() {
        System.out.println("从Oracle数据库中读取数据");
    }
}
