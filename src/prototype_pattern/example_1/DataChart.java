package prototype_pattern.example_1;

import java.io.*;

/**
 * 图表对象
 * @author Cnc_hzf
 * @date 2022/4/22 16:00
 */
public class DataChart implements Serializable {
    /**
     * ds : 图表数据集
     * color : 图表颜色
     * no ： 图表编号
     */
    private DataSet ds = new DataSet();
    private String color;
    private int no;

    public DataSet getDs() {
        return ds;
    }

    public void setDs(DataSet ds) {
        this.ds = ds;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    /**
     * 打印图表
     */
    public void display() {
        System.out.println("图表编号：" + this.getNo());
        System.out.println("图表颜色：" + this.getColor());
        System.out.println("图表数据集");
        for (int i = 0; i < ds.getLength(); ++ i ) {
            System.out.println(i + " : " + ds.getData(i));
        }
    }

    /**
     * 使用序列化技术实现深克隆
     */
    public DataChart deepClone() throws IOException, ClassNotFoundException, OptionalDataException {
        // 将对象写入流中
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        // 将对象从流中取出
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return (DataChart) objectInputStream.readObject();
    }
}
