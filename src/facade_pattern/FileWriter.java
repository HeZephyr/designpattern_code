package facade_pattern;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件保存类，充当子系统类
 * @author Cnc_hzf
 * @date 2022/4/28 20:34
 */
public class FileWriter {
    /**
     * 将加密后的内容保存在文件中
     * @param encryptStr
     * @param fileNameDes
     */
    public void write(String encryptStr, String fileNameDes) {
        System.out.println("保存密文，写入文件。");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileNameDes);
            fileOutputStream.write(encryptStr.getBytes());
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        } catch (IOException e) {
            System.out.println("文件操作错误！");
        }
    }
}
