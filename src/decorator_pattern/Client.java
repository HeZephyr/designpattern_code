package decorator_pattern;
/**
 * 客户端测试类
 * @author Cnc_hzf
 * @date 2022/4/28 15:13
 */
public class Client {
    public static void main(String[] args) {
        Cellphone phone1, phone2, phone3;
        phone1 = new SimplePhone();
        System.out.println("**************简单手机来电**********");
        phone1.receiveCall();
        phone2 = new JarPhone(phone1);
        System.out.println("**************加了振动的手机来电**********");
        phone2.receiveCall();
        phone3 = new ComplexPhone(phone2);
        System.out.println("**************加了振动和灯光闪烁的手机来电**********");
        phone3.receiveCall();
    }
}
