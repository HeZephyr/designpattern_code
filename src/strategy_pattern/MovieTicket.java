package strategy_pattern;
/**
 * 电影票类，充当环境类
 * @author Cnc_hzf
 * @date 2022/4/30 19:51
 */
public class MovieTicket {
    private double price;
    private Discount discount;

    public double getPrice() {
        return discount.calculate(price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
