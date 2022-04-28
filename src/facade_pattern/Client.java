package facade_pattern;
/**
 * 客户端测试类
 * @author Cnc_hzf
 * @date 2022/4/28 20:45
 */
public class Client {
    public static void main(String[] args) {
        EncryptFacade encryptFacade = new EncryptFacade();
        encryptFacade.fileEncrypt("src//facade_pattern//src.txt", "src//facade_pattern//des.txt");
    }
}