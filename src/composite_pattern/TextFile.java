package composite_pattern;
/**
 * 文本文件类
 * @author Cnc_hzf
 * @date 2022/4/25 19:29
 */
public class TextFile extends AbstractFile {
    private String name;

    TextFile(String name) {
        this.name = name;
    }
    @Override
    public void add(AbstractFile file) {
        System.out.println("不支持此方法");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("不支持此方法");
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.println("不支持此方法");
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("----对文本文件'" + name + "'进行杀毒！");
    }
}
