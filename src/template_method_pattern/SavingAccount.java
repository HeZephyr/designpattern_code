package template_method_pattern;
/**
 * 定期账户类，充当具体子类
 * @author Cnc_hzf
 * @date 2022/5/1 13:23
 */
public class SavingAccount extends Account {
    @Override
    public void calculateInterest() {
        System.out.println("按定期利率计算利息！");
    }
}
