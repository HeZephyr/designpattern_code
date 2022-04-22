package prototype_pattern.example_1;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端类，测试
 * @author Cnc_hzf
 * @date 2022/4/22 16:24
 */
public class Client {

    public static void main(String[] args) {
        DataChart dataChart1 = null, dataChart2 = null;
        dataChart1 = new DataChart();
        dataChart1.setColor("red");
        dataChart1.setNo(1);
        List data = new ArrayList<Integer>();
        data.add(1);
        data.add(2);
        DataSet ds = new DataSet();
        ds.setData(data);
        dataChart1.setDs(ds);
        try {
            // 调用深克隆方法创建一个克隆对象
            dataChart2 = dataChart1.deepClone();
            System.out.println(dataChart1 == dataChart2);
            System.out.println(dataChart1.getDs() == dataChart2.getDs());
            System.out.println(dataChart1.getNo() == dataChart2.getNo());
            System.out.println(dataChart1.getColor() == dataChart2.getColor());
        } catch (Exception e) {
            System.out.println("克隆失败！");
        }
    }
}
