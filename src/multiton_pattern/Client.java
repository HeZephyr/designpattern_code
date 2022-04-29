package multiton_pattern;
/**
 * 客户端测试类
 * @author Cnc_hzf
 * @date 2022/4/29 16:32
 */
public class Client {
    public static void main(String[] args) {
        Multiton multiton1, multiton2, multiton3, multiton4;
        multiton1 = Multiton.getInstance();
        multiton2 = Multiton.getInstance();
        multiton3 = Multiton.getInstance();
        multiton4 = Multiton.getInstance();

        System.out.println(multiton1 == multiton2);
        System.out.println(multiton2 == multiton3);
        System.out.println(multiton3 == multiton4);
    }
}
