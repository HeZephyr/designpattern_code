package simple_factory_pattern;

/**
 * @author Cnc_hzf
 */
public class ShapeFactory {
    public static Shape createShape(String type) throws UnsupportedShapeException {
        Shape shape = null;
        if (type.equalsIgnoreCase("Circle")) {
            shape = new Circle();
        } else if (type.equalsIgnoreCase("Rectangle")) {
            shape = new Rectangle();
        } else if (type.equalsIgnoreCase("Triangle")) {
            shape = new Triangle();
        } else {
            throw new UnsupportedShapeException("UnsupportedShapeException");
        }
        return shape;
    }
}
