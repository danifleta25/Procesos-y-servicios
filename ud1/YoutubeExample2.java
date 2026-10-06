package ud1;

import java.io.IOException;
import java.io.InterruptedIOException;

public class YoutubeExample2 {

    public static void main(String[] args) {


        try {
            ProcessBuilder builder = new ProcessBuilder("ping", "www.google.com");
            Process proceso = builder.start();

            int estadoSalida = proceso.waitFor(); // Espera a que el proceso termine
            System.out.println("Estado salida: " + estadoSalida);
        } catch (IOException | InterruptedException e){
            e.printStackTrace();
        }


    }
}
