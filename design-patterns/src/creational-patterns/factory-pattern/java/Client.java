/**
 * Created by sourindra.chatterji on 25/02/18.
 */
public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("CIRCLE");
        if (shape != null){
            shape.draw();
        }

        shape = shapeFactory.getShape("RECTANGLE");
        if (shape != null){
            shape.draw();
        }

        shape = shapeFactory.getShape("SQUARE");
        if (shape != null){
            shape.draw();
        }

        shape = shapeFactory.getShape("PYRAMID");
        if (shape != null){
            shape.draw();
        }

    }
}
