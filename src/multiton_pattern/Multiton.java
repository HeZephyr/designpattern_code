package multiton_pattern;

import java.util.Random;

/**
 * 多例模式类
 * @author Cnc_hzf
 * @date 2022/4/29 16:25
 */
public class Multiton {
    /**
     * 创建3个数据库连接对象，存储在数组中
     */
    private static Multiton[] array = {new Multiton(), new Multiton(), new Multiton()};

    /**
     * 私有构造函数，防止外部new
     */
    private Multiton() {

    }
    public static int random() {
        Random random = new Random();
        int value = Math.abs(random.nextInt());
        return value % 3;
    }
    /**
     * 静态工厂方法，随机返回数组中的一个实例
     * @return 一个实例对象
     */
    public static Multiton getInstance() {
        return array[random()];
    }
}
