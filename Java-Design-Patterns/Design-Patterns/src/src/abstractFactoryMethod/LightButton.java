package abstractFactoryMethod;

public class LightButton implements Button{
    @Override
    public void render() {
        System.out.println("Light Button");
    }

    @Override
    public void click() {
        System.out.println("Light Button clicked");
    }
}
