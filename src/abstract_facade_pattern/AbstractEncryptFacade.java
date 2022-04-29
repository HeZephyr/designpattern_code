package abstract_facade_pattern;
/**
 * 抽象外观类
 * @author Cnc_hzf
 * @date 2022/4/29 10:39
 */
public abstract class AbstractEncryptFacade {
    /**
     * 文件加密
     * @param fileNameSrc
     * @param fileNameDes
     */
    public abstract void fileEncrypt(String fileNameSrc, String fileNameDes);
}
