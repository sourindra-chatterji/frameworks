package creational_patterns.abstract_factory;

/**
 * Created by sourindra.chatterji on 25/02/18.
 */
public class ColorFactory extends AbstractFactory {
    public Color getColor(String color){
        if (color.isEmpty()){
            return null;
        }
        switch (color){
            case "RED":
                return new Red();
            case "GREEN":
                return new Green();
            default:
                return null;
        }
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
