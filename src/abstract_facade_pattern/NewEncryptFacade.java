package abstract_facade_pattern;
import facade_pattern.*;

/**
 * 具体加密外观类
 * @author Cnc_hzf
 * @date 2022/4/29 11:14
 */
public class NewEncryptFacade extends AbstractEncryptFacade {
    private FileReader fileReader;
    private NewCipherMachine newCipherMachine;
    private FileWriter fileWriter;
    NewEncryptFacade() {
        fileReader = new FileReader();
        newCipherMachine = new NewCipherMachine();
        fileWriter = new FileWriter();
    }
    @Override
    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = fileReader.read(fileNameSrc);
        String encryptStr = newCipherMachine.encrypt(plainStr);
        fileWriter.write(encryptStr, fileNameDes);
    }
}
