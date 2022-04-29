package proxy_pattern;
/**
 * 真实主题角色类
 * @author Cnc_hzf
 * @date 2022/4/29 15:19
 */
public class RealPermission extends AbstractPermission {
    @Override
    public void modifyNote() {
        System.out.println("修改帖子！");
    }

    @Override
    public void modifyUserinfo() {
        System.out.println("修改用户信息！");
    }

    @Override
    public void publishNote() {
        System.out.println("发布帖子！");
    }

    @Override
    public void viewNote() {
        System.out.println("查看帖子！");
    }

    @Override
    public void setLevel(int level) {

    }
}
