package decorator_pattern;
/**
 * 提供振动提示类
 * @author Cnc_hzf
 * @date 2022/4/28 14:51
 */
public class JarPhone extends PhoneDecorator {
    JarPhone(Cellphone cellphone) {
        super(cellphone);
    }

    @Override
    public void receiveCall() {
        super.receiveCall();
        vibrate();
    }
    public void vibrate() {
        System.out.println("产生振动提示");
    }
}
