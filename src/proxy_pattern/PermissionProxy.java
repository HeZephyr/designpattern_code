package proxy_pattern;
/**
 * 代理主题角色类
 * @author Cnc_hzf
 * @date 2022/4/29 15:21
 */
public class PermissionProxy extends AbstractPermission {
    private RealPermission permission = new RealPermission();
    int level = 0;

    @Override
    public void modifyNote() {
        if (level == 0) {
            System.out.println("对不起，您没有权限！");
        } else if (level == 1) {
            permission.modifyNote();
        }
    }

    @Override
    public void modifyUserinfo() {
        if (level == 0) {
            System.out.println("对不起，您没有权限！");
        } else if (level == 1) {
            permission.modifyUserinfo();
        }
    }

    @Override
    public void viewNote() {
        permission.viewNote();
    }

    @Override
    public void publishNote() {
        if (level == 0) {
            System.out.println("对不起，您没有权限！");
        } else if (level == 1) {
            permission.publishNote();
        }
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }
}
