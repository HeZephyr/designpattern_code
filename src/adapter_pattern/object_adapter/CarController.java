package adapter_pattern.object_adapter;

/**
 * 抽象目标类
 * @author Cnc_hzf
 * @date 2022/4/24 18:36
 */
public abstract class CarController {
    /**
     * 玩具汽车移动
     */
    public void move() {
        System.out.println("玩具汽车移动！");
    }

    /**
     * 汽车鸣笛
     */
    public abstract void phonate();

    /**
     * 灯光闪烁
     */
    public abstract void twinkle();
}
