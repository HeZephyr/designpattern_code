package facade_pattern;
/**
 * 数据加密类，充当子系统类
 * @author Cnc_hzf
 * @date 2022/4/28 20:17
 */
public class CipherMachine {
    /**
     * 字符串加密
     * @param plainText
     * @return 加密后的字符串
     */
    public String encrypt(String plainText) {
        StringBuffer stringBuffer = new StringBuffer(plainText);
        System.out.print("数据加密，将明文转换为密文：");
        String result = stringBuffer.reverse().toString();
        System.out.println(result);
        return result;
    }
}
