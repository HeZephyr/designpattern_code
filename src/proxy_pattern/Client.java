package proxy_pattern;
/**
 * 客户端测试类
 * @author Cnc_hzf
 * @date 2022/4/29 15:26
 */
public class Client {
    public static void main(String[] args) {
        AbstractPermission permission;
        permission = (PermissionProxy) XMLUtils.getBean();
        System.out.println("**************游客身份*************");
        permission.modifyUserinfo();
        permission.modifyUserinfo();
        permission.publishNote();
        permission.viewNote();
        permission.setLevel(1);
        System.out.println("**************用户身份*************");
        permission.modifyUserinfo();
        permission.modifyUserinfo();
        permission.publishNote();
        permission.viewNote();
    }
}
