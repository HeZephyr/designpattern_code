package simple_factory_pattern;
/**
 * @author Cnc_hzf
 */
public class Client {
    public static void main(String[] args) {
        Shape shape = null;
        String shapeType = (String)XMLUtils.getShapeType();
        try {
            shape = ShapeFactory.createShape(shapeType);
            shape.draw();
            shape.erase();
        } catch (UnsupportedShapeException e) {
            e.printStackTrace();
        }
    }
}
