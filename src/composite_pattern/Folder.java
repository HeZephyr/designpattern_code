package composite_pattern;

import java.util.ArrayList;

/**
 * 文件夹类
 * @author Cnc_hzf
 * @date 2022/4/25 19:34
 */
public class Folder extends AbstractFile {
    private ArrayList<AbstractFile> fileList = new ArrayList<AbstractFile>();
    private String name;

    Folder(String name) {
        this.name = name;
    }
    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return (AbstractFile) fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒！");
        for (AbstractFile file : fileList) {
            file.killVirus();
        }
    }
}
