package template_method_pattern;
/**
 * 活期账户类，充当具体子类
 * @author Cnc_hzf
 * @date 2022/5/1 13:22
 */
public class CurrentAccount extends Account {
    @Override
    public void calculateInterest() {
        System.out.println("按活期利率计算利息！");
    }
}
