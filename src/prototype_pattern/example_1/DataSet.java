package prototype_pattern.example_1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 数据集类
 * @author Cnc_hzf
 * @date 2022/4/22 15:52
 */
public class DataSet implements Serializable {
    private List data = new ArrayList<Integer>();

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
    public void addData(int value) {
        data.add(value);
    }
    public Integer getData(int pos) {
        return (Integer) data.get(pos);
    }
    public void removeData(int pos) {
        data.remove(pos);
    }
    public int getLength() {
        return data.size();
    }
}
