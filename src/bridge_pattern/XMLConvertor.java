package bridge_pattern;
/**
 * 扩充抽象类
 * @author Cnc_hzf
 * @date 2022/4/24 21:10
 */
public class XMLConvertor extends FileConvertor {
    @Override
    public void translate() {
        dataHandler.readData();
        System.out.println("转换成XML格式的数据");
    }
}
