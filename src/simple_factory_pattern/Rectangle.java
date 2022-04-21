package simple_factory_pattern;
/**
 * @author Cnc_hzf
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("绘制长方形");
    }
    @Override
    public void erase() {
        System.out.println("擦除长方形");
    }
}
