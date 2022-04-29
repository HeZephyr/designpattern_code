package proxy_pattern;
/**
 * 抽象主题角色
 * @author Cnc_hzf
 * @date 2022/4/29 15:07
 */
public abstract class AbstractPermission {
    /**
     * 修改用户信息
     */
    public abstract void modifyUserinfo();

    /**
     * 看帖子
     */
    public abstract void viewNote();

    /**
     * 发布帖子
     */
    public abstract void publishNote();

    /**
     * 修改帖子
     */
    public abstract void modifyNote();

    /**
     * 设置权限
     * @param level
     */
    public abstract void setLevel(int level);
}
