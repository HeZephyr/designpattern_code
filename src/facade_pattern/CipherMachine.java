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
        System.out.print("数据加密，将明文转为密文：");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < plainText.length(); ++ i ) {
            // 加密规则为将ASCII码值减5减i，那么恢复就是+5+i
            stringBuffer.append(plainText.charAt(i) - 5 - i);
        }
        System.out.println(stringBuffer);
        return stringBuffer.toString();
    }
}
