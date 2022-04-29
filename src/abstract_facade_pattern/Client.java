package abstract_facade_pattern;
/**
 * 客户端测试类
 * @author Cnc_hzf
 * @date 2022/4/29 11:26
 */
public class Client {
    public static void main(String[] args) {
        // 针对抽象外观类进行编程
        AbstractEncryptFacade abstractEncryptFacade;
        // 读取配置文件，反射生成对象
        abstractEncryptFacade = (AbstractEncryptFacade) XMLUtils.getBean();
        abstractEncryptFacade.fileEncrypt("src//abstract_facade_pattern//src.txt", "src//abstract_facade_pattern//des.txt");
    }
}
