package creational_patterns.abstract_factory;

/**
 * Created by sourindra.chatterji on 25/02/18.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }
        if (choice.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        return null;
    }
}
