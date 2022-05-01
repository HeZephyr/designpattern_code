package template_method_pattern;
/**
 * 客户端测试类
 * @author Cnc_hzf
 * @date 2022/5/1 13:24
 */
public class Client {
    public static void main(String[] args) {
        Account account;
        account = (Account) XMLUtils.getBean();
        account.handle("张无忌", "123456");
    }
}
