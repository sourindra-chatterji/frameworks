/**
 * Created by sourindra.chatterji on 25/02/18.
 */
public class ShapeFactory {
    public Shape getShape(String shape){
        if (shape.isEmpty()){
            return null;
        }
        switch (shape){
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Recatangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
