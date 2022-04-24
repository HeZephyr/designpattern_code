package bridge_pattern;
/**
 * 扩充抽象类角色
 * @author Cnc_hzf
 * @date 2022/4/24 21:12
 */
public class PDFConvertor extends FileConvertor {
    @Override
    public void translate() {
        dataHandler.readData();
        System.out.println("转换成PDF格式的数据");
    }
}
