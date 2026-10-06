package ud1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;

public class LecturaProcesoExample {
    public static void main(String[] args) throws IOException {

        ProcessBuilder pb = new ProcessBuilder("ping", "127.0.0.1");

        try {
            Process proceso = pb.start();

            BufferedReader lector = new BufferedReader(
                    new InputStreamReader(proceso.getInputStream()));

            String linea;

            while ((linea = lector.readLine()) != null){
                System.out.println("CANTIDAD: " + linea);
            }
            int res = proceso.waitFor();
            System.out.println("Fin con codigo: " + res);




        }catch (IOException | InterruptedException e){
            e.printStackTrace();
        }
    }


}
