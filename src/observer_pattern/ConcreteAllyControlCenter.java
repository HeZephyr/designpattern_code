package observer_pattern;

/**
 * 具体指挥部类，充当具体目标类
 * @author Cnc_hzf
 * @date 2022/4/30 16:53
 */
public class ConcreteAllyControlCenter extends AllyControlCenter {
    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName + "战队组建成功！");
        System.out.println("------------------------------");
        this.allyName = allyName;
    }
    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName + "战队紧急通知，盟友" + name + "遭受敌人攻击");
        // 遍历观察者集合对象，调用每一个盟友（除自己）的支援方法
        for (Observer obs : players) {
            if (!obs.getName().equalsIgnoreCase(name)) {
                obs.help();
            }
        }
    }
}
