package singleton_pattern;
/**
 * 客户端测试类
 * @author Cnc_hzf
 * @date 2022/4/22 20:37
 */
public class Client {
    public static void main(String[] args) {
        // 创建4个LoadBalancer对象
        LoadBalancer balancer1, balancer2, balancer3, balancer4;
        balancer1 = LoadBalancer.getLoadBalancer();
        balancer2 = LoadBalancer.getLoadBalancer();
        balancer3 = LoadBalancer.getLoadBalancer();
        balancer4 = LoadBalancer.getLoadBalancer();

        if (balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4) {
            System.out.println("服务器负载均衡器具有唯一性！");
        }

        // 增加服务器
        balancer1.addServer("Server 1");
        balancer2.addServer("Server 2");
        balancer3.addServer("Server 3");
        balancer4.addServer("Server 4");

        // 模拟客户端请求的分发
        for (int i = 0; i < 10; ++ i ) {
            String server =  balancer1.getServer();
            System.out.println("分发请求至服务器：" + server);
        }
    }
}
