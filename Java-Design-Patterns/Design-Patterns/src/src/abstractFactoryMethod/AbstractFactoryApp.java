package abstractFactoryMethod;

import java.util.Scanner;

public class AbstractFactoryApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select theme (dark/light): ");
        String theme = scanner.nextLine().trim().toLowerCase();

        AbstractGUIFactory GUIfactory;

        if(theme.equals("dark")){
            GUIfactory = new DarkThemeGUIFactory();
        }
        else if(theme.equals("light")){
            GUIfactory = new LightThemeGUIFactory();
        }
        else{
            throw new IllegalArgumentException("Unknown theme");
        }

        Button button = GUIfactory.createButton();
        TextField textField = GUIfactory.createTextField();

        button.render();
        button.click();

        textField.render();
        textField.setText("Hello World!");

        scanner.close();

    }

}
