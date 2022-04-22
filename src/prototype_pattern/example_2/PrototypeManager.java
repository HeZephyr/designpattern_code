package prototype_pattern.example_2;

import java.util.Hashtable;

/**
 * 原型管理器（使用饿汉式单例实现）
 * @author Cnc_hzf
 * @date 2022/4/22 16:53
 */
public class PrototypeManager {
    /**
     * 定义一个Hashtable，用于存储原型对象
     */
    private Hashtable hashtable = new Hashtable();
    /**
     * 定义一个原型管理器实例，设置为静态变量
     */
    private static PrototypeManager prototypeManager = new PrototypeManager();

    /**
     * 构造方法，为hashtable添加公文对象。
     * 注意这里的构造方法是私有的
     */
    private PrototypeManager() {
        hashtable.put("FAR", new FAR());
        hashtable.put("SRS", new SRS());
    }

    /**
     * 增加新的公文对象
     * @param key
     * @param officialDocument
     */
    public void addOfficialDocument(String key, OfficialDocument officialDocument) {
        hashtable.put(key, officialDocument);
    }

    /**
     * 通过浅克隆获取新的公文对象
     * @param key
     * @return 克隆的公文对象
     */
    public OfficialDocument getOfficialDocument(String key) {
        return ((OfficialDocument) hashtable.get(key)).clone();
    }

    /**
     * 静态方法，返回原型管理器
     * @return 原型管理器
     */
    public static PrototypeManager getPrototypeManager() {
        return prototypeManager;
    }
}
