package strategy_pattern;
/**
 * 客户端测试类
 * @author Cnc_hzf
 * @date 2022/4/30 19:53
 */
public class Client {
    public static void main(String[] args) {
        MovieTicket mt = new MovieTicket();
        double originalPrice = 60.0;
        double currentPrice;

        mt.setPrice(originalPrice);
        System.out.println("原始价为：" + originalPrice);
        System.out.println("----------------------");

        Discount discount;
        // 读取配置文件并反射生成具体折扣对象
        discount = (Discount) XMLUtils.getBean();
        // 注入折扣对象
        mt.setDiscount(discount);

        currentPrice = mt.getPrice();
        System.out.println("折后价为：" + currentPrice);
    }
}
