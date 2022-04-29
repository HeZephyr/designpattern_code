package abstract_facade_pattern;
/**
 * 移位加密类
 * @author Cnc_hzf
 * @date 2022/4/29 11:11
 */
public class NewCipherMachine {
    /**
     * 数据加密
     * @param plainText
     * @return
     */
    public String encrypt(String plainText) {
        System.out.print("数据加密，将明文转换为密文：");
        // 设置密钥，移位数为10
        int key = 10;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < plainText.length(); ++ i ) {
            char c = plainText.charAt(i);
            // 小写字母和大写字母移位
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                c += key % 26;
                if (c > 'z' || c > 'Z') {
                    c -= 26;
                } else if (c < 'A' || c < 'a') {
                    c += 26;
                }
            }
            stringBuffer.append(c);
        }
        System.out.println(stringBuffer.toString());
        return stringBuffer.toString();
    }
}
