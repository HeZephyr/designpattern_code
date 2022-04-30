package observer_pattern;
/**
 * 客户端测试类
 * @author Cnc_hzf
 * @date 2022/4/30 17:00
 */
public class Client {
    public static void main(String[] args) {
        // 定义观察目标对象
        AllyControlCenter acc;
        acc = new ConcreteAllyControlCenter("金庸群侠");

        // 定义4个观察者对象
        Observer player1, player2, player3, player4;

        player1 = new Player("杨过");
        player2 = new Player("令狐冲");
        player3 = new Player("张无忌");
        player4 = new Player("郭靖");

        acc.join(player1);
        acc.join(player2);
        acc.join(player3);
        acc.join(player4);

        // 某成员遭到攻击
        player1.beAttacked(acc);
    }
}
