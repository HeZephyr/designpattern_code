package bridge_pattern;
/**
 * 扩充抽象类
 * @author Cnc_hzf
 * @date 2022/4/24 21:06
 */
public class TXTConvertor extends FileConvertor {
    @Override
    public void translate() {
        dataHandler.readData();
        System.out.println("转换成TXT格式的数据");
    }
}
