package bridge_pattern;
/**
 * 客户端测试类
 * @author Cnc_hzf
 * @date 2022/4/24 21:12
 */
public class Client {
    public static void main(String[] args) {
        FileConvertor fileConvertor = (FileConvertor) XMLUtils.getBean("className1");
        fileConvertor.setDataHandler((DataHandler) XMLUtils.getBean("className2"));
        fileConvertor.translate();
    }
}
