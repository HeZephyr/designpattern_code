package strategy_pattern;
/**
 * 折扣类，充当抽象策略类
 * @author Cnc_hzf
 * @date 2022/4/30 19:42
 */
public abstract class Discount {
    /**
     * 计算最终价钱
     * @param price
     * @return 最终价格
     */
    public abstract double calculate(double price);
}
