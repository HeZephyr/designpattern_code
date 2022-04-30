package observer_pattern;

import java.util.ArrayList;
import java.util.List;
/**
 * 指挥部类，充当抽象目标类。
 * @author Cnc_hzf
 * @date 2022/4/30 16:51
 */
public abstract class AllyControlCenter {
    /**
     * 定义一个集合存储战队队员
     */
    protected List<Observer> players = new ArrayList();
    /**
     * 战队名称
     */
    protected String allyName;

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    /**
     * 加入战队方法
     * @param obs
     */
    public void join(Observer obs) {
        players.add(obs);
    }

    /**
     * 退出战队方法
     * @param obs
     */
    public void quit(Observer obs) {
        players.remove(obs);
    }

    /**
     * 通知观察者方法，name为被攻击的盟友
     * @param name
     */
    public abstract void notifyObserver(String name);
}
