package creational_patterns.factory_pattern;

/**
 * Created by sourindra.chatterji on 25/02/18.
 */
public class Client {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("CIRCLE");
        if (shape != null){
            shape.draw();
        }

        shape = ShapeFactory.getShape("RECTANGLE");
        if (shape != null){
            shape.draw();
        }

        shape = ShapeFactory.getShape("SQUARE");
        if (shape != null){
            shape.draw();
        }

        shape = ShapeFactory.getShape("PYRAMID");
        if (shape != null){
            shape.draw();
        }

    }
}
