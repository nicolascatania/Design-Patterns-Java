package Singleton;

public class SingletonApp {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.writeLog("Hello, first message from the first reference to the logger.");
        logger.writeLog("Hello, second message from the first reference to the logger.");

        Logger logger2 = Logger.getInstance();

        logger2.writeLog("Hello, third message from the second reference to the logger.");
        //logger & logger2 points to the same value, our unique logger instance.
        //This way we manage to get only ONE instance of a class accessing to the .txt file.


    }

}
