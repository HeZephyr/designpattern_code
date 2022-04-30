package strategy_pattern;
/**
 * 学生折扣类，充当具体策略类
 * @author Cnc_hzf
 * @date 2022/4/30 19:43
 */
public class StudentDiscount extends Discount {
    /**
     * 折扣
     */
    private final double DISCOUNT = 0.8;
    @Override
    public double calculate(double price) {
        System.out.println("********学生票********");
        return price * DISCOUNT;
    }
}
