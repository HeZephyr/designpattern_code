package bridge_pattern;
/**
 * 抽象类角色
 * @author Cnc_hzf
 * @date 2022/4/24 20:56
 */
public abstract class FileConvertor {
    protected DataHandler dataHandler;

    public void setDataHandler(DataHandler dataHandler) {
        this.dataHandler = dataHandler;
    }

    /**
     * 转换数据
     */
    public abstract void translate();
}
