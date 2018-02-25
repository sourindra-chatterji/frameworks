package creational_patterns.abstract_factory;

/**
 * Created by sourindra.chatterji on 25/02/18.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() function");
    }
}
