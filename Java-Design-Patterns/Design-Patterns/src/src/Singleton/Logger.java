package Singleton;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    //this will be the ONLY instance available for the program.
    private static Logger instance;

    private final String fileDir = "log.txt";

    //Constructor MUST be private
    private Logger(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileDir, true))){
            writer.write("Logger initiated\n");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //Public method to get the class instance
    //Using synchronized to avoid multi-thread process to create multiple instances of this class. In this case is not useful, but it's important to know this.
    public static synchronized Logger getInstance(){
        //if there is no existing instance of logger yet, we create it, if it does exist, we return it.
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }


    public void writeLog(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileDir, true))) {
            writer.write(getCurrentDate() + " - " + message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para obtener la fecha y hora actual formateada
    private String getCurrentDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }
}
