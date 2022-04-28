package decorator_pattern;
/**
 * 抽象装饰类
 * @author Cnc_hzf
 * @date 2022/4/28 14:41
 */
public class PhoneDecorator extends Cellphone {
    private Cellphone cellphone;
    PhoneDecorator(Cellphone cellphone) {
        this.cellphone = cellphone;
    }

    @Override
    public void receiveCall() {
        cellphone.receiveCall();
    }
}
