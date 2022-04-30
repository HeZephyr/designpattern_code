package strategy_pattern;
/**
 * 儿童折扣类，充当具体策略类
 * @author Cnc_hzf
 * @date 2022/4/30 19:45
 */
public class ChildrenDiscount extends Discount {
    /**
     * DISCOUNT为减免的金额
     * MIN为最低需要的价钱
     */
    private final double DISCOUNT = 10;
    private final double MIN = 20;
    @Override
    public double calculate(double price) {
        System.out.println("********儿童票********");
        if (price >= MIN) {
            return price - DISCOUNT;
        }
        return price;
    }
}
