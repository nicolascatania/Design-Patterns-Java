package abstractFactoryMethod;

public class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("Dark button");
    }

    @Override
    public void click() {
        System.out.println("Dark button clicked");
    }
}
