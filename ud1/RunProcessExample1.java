package ud1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

public class RunProcessExample1 {
    public static void main(String[] args) {

        //Comando que usa el programa para iniciar un proceso
        String[] program = {"notepad"};

        ProcessBuilder pb = new ProcessBuilder(program);

        try {
            //Inicia el proceso
            Process process = pb.start();
            System.out.printf("Se ha iniciado el proceso: %s\n", Arrays.toString(program));
            // El proceso padre espera a que el proceso hijo finalice
            int codiRetorn = process.waitFor();
            System.out.println("La ejecucion de " + Arrays.toString(program) + " retorna " + codiRetorn);
        } catch (IOException ex) {
            System.out.println("Excepcion de ·/S");
            System.out.println(ex.getMessage());
            System.exit(-1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}