package simple_factory_pattern;
/**
 * @author Cnc_hzf
 */
public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
    @Override
    public void erase() {
        System.out.println("擦除三角形");
    }
}
