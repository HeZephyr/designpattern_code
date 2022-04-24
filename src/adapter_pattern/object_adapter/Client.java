package adapter_pattern.object_adapter;
/**
 * 客户端测试类
 * @author Cnc_hzf
 * @date 2022/4/24 18:43
 */
public class Client {
    public static void main(String[] args) {
        CarController carController = (CarController) XMLUtils.getBean();
        carController.move();
        carController.phonate();
        carController.twinkle();
    }
}
