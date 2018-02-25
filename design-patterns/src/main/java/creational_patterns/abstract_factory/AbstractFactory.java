package creational_patterns.abstract_factory;

/**
 * Created by sourindra.chatterji on 25/02/18.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
