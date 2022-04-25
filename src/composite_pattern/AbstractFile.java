package composite_pattern;
/**
 * 抽象文件类
 * @author Cnc_hzf
 * @date 2022/4/25 19:26
 */
public abstract class AbstractFile {
    /**
     * 添加文件
     * @param file
     */
    public abstract void add(AbstractFile file);

    /**
     * 删除文件
     * @param file
     */
    public abstract void remove(AbstractFile file);

    /**
     * 获取第i个文件
     * @param i
     * @return
     */
    public abstract AbstractFile getChild(int i);

    /**
     * 业务方法：杀毒
     */
    public abstract void killVirus();
}
