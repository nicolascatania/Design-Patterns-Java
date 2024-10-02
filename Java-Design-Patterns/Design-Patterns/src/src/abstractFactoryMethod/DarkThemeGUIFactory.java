package abstractFactoryMethod;

public class DarkThemeGUIFactory implements AbstractGUIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextField createTextField() {
        return new DarkTextField();
    }
}
