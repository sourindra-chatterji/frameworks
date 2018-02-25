package creational_patterns.abstract_factory;

/**
 * Created by sourindra.chatterji on 25/02/18.
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape shape = shapeFactory.getShape("SQUARE");
        shape.draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color color = colorFactory.getColor("RED");
        color.fill();
    }
}
