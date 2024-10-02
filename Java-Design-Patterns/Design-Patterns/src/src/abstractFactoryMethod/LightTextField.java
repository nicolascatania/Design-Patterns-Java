package abstractFactoryMethod;

public class LightTextField implements TextField {

    private String displayText;

    @Override
    public void render() {
        System.out.println("Light TextField: " + displayText);
    }

    @Override
    public void setText(String text) {
        this.displayText = text;
    }


}
