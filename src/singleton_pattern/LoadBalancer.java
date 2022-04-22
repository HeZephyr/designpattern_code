package singleton_pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 负载均衡器类
 * @author Cnc_hzf
 * @date 2022/4/22 20:33
 */
public class LoadBalancer {
    /**
     * 私有静态成员变量，存储唯一实例
     */
    private static LoadBalancer loadBalancer = null;
    /**
     * 服务器集合
     */
    private List serverList = null;

    /**
     * 私有构造函数
     */
    private LoadBalancer() {
        serverList = new ArrayList();
    }

    /**
     * 共有静态成员方法，返回唯一实例
     * @return 负载均衡器类
     */
    public static LoadBalancer getLoadBalancer() {
        if (loadBalancer == null) {
            loadBalancer = new LoadBalancer();
        }
        return loadBalancer;
    }

    /**
     * 增加服务器
     * @param server
     */
    public void addServer(String server) {
        serverList.add(server);
    }

    /**
     * 删除服务器
     * @param server
     */
    public void removeServer(String server) {
        serverList.remove(server);
    }
    public String getServer() {
        Random random = new Random();
        int index = random.nextInt(serverList.size());
        return (String) serverList.get(index);
    }
}
