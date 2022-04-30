package strategy_pattern;
/**
 * VIP折扣类，充当具体策略类
 * @author Cnc_hzf
 * @date 2022/4/30 19:50
 */
public class VIPDiscount extends Discount {
    private final double DISCOUNT = 0.5;
    @Override
    public double calculate(double price) {
        System.out.println("********VIP票********");
        return price * DISCOUNT;
    }
}
