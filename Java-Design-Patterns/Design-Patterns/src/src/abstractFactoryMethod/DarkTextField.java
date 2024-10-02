package abstractFactoryMethod;

public class DarkTextField implements TextField {

    private String displayText;

    @Override
    public void render() {
        System.out.println("Dark TextField: " + displayText);
    }

    @Override
    public void setText(String text) {
        this.displayText = text;
    }
}
