package simple_factory_pattern;
/**
 * @author Cnc_hzf
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
    @Override
    public void erase() {
        System.out.println("擦除圆形");
    }
}
