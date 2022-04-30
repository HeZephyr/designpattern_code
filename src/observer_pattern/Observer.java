package observer_pattern;
/**
 * 抽象观察者
 * @author Cnc_hzf
 * @date 2022/4/30 16:45
 */
public interface Observer {
    /**
     * 获取名称方法
     * @return 名称
     */
    public String getName();

    /**
     * 设置名称方法
     * @param name
     */
    public void setName(String name);

    /**
     * 支援盟友方法
     */
    public void help();

    /**
     * 遭受攻击方法
     * @param acc
     */
    public void beAttacked(AllyControlCenter acc);
}
