package facade_pattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 文件读取类，充当子系统类
 * @author Cnc_hzf
 * @date 2022/4/28 19:32
 */
public class FileReader {
    /**
     * 读取文件
     * @param fileNameSrc
     * @return 文件内容
     */
    public String read(String fileNameSrc) {
        System.out.print("读取文件，获取明文：");
        StringBuffer stringBuffer = new StringBuffer();
        try {
            FileInputStream fileInputStream = new FileInputStream(fileNameSrc);
            int data;
            // 读取数据
            while ((data = fileInputStream.read()) != -1) {
                stringBuffer.append((char)data);
            }
            fileInputStream.close();
            System.out.println(stringBuffer);
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        } catch (IOException e) {
            System.out.println("文件操作错误！");
        }
        return stringBuffer.toString();
    }
}
