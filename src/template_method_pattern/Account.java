package template_method_pattern;
/**
 * 账户类，充当抽象类
 * @author Cnc_hzf
 * @date 2022/5/1 13:17
 */
public abstract class Account {
    public boolean validate(String account, String password) {
        System.out.println("账号：" + account);
        System.out.println("密码：" + password);
        if (account.equalsIgnoreCase("张无忌") && password.equalsIgnoreCase("123456")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 基本方法——抽象方法
     */
    public abstract void calculateInterest();
    public void display() {
        System.out.println("显示利息！");
    }
    public void handle(String account, String password) {
        if (!validate(account, password)) {
            System.out.println("账号或密码错误！");
        } else {
            calculateInterest();
            display();
        }
    }
}
