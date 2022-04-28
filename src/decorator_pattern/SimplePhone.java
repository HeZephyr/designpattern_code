package decorator_pattern;
/**
 * 简单手机类
 * @author Cnc_hzf
 * @date 2022/4/28 14:40
 */
public class SimplePhone extends Cellphone {
    @Override
    public void receiveCall() {
        System.out.println("产生声音提示：主人，来电话了！");
    }
}
