package decorator_pattern;
/**
 * 灯光闪烁
 * @author Cnc_hzf
 * @date 2022/4/28 15:01
 */
public class ComplexPhone extends PhoneDecorator {
    ComplexPhone(Cellphone cellphone) {
        super(cellphone);
    }
    @Override
    public void receiveCall() {
        super.receiveCall();
        sparkle();
    }
    public void sparkle() {
        System.out.println("灯光闪烁提示");
    }
}
