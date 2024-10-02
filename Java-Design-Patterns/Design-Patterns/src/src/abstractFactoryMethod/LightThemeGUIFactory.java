package abstractFactoryMethod;

public class LightThemeGUIFactory implements AbstractGUIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public TextField createTextField() {
        return new LightTextField();
    }
}
