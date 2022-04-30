package observer_pattern;

/**
 * 战队成员类，充当具体观察者
 * @author Cnc_hzf
 * @date 2022/4/30 17:08
 */
public class Player implements Observer {
    private String name;
    public Player(String name) {
        this.name = name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void help() {
        System.out.println("坚持住，" + name + "来救你！");
    }

    @Override
    public void beAttacked(AllyControlCenter acc) {
        System.out.println(name + "被攻击！");
        acc.notifyObserver(name);
    }
}
