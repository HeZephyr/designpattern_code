package abstract_facade_pattern;

import facade_pattern.*;

/**
 * 加密外观类，充当外观类
 * @author Cnc_hzf
 * @date 2022/4/28 20:41
 */
public class EncryptFacade extends AbstractEncryptFacade {
    /**
     * 维持对子系统对象的引用
     */
    private FileReader fileReader;
    private CipherMachine cipherMachine;
    private FileWriter fileWriter;

    EncryptFacade() {
        fileReader = new FileReader();
        cipherMachine = new CipherMachine();
        fileWriter = new FileWriter();
    }
    @Override
    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = fileReader.read(fileNameSrc);
        String encryptStr = cipherMachine.encrypt(plainStr);
        fileWriter.write(encryptStr, fileNameDes);
    }
}
