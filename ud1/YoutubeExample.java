package ud1;

public class YoutubeExample {

    public static void main(String[] args) {


        try {
            Runtime runtime = Runtime.getRuntime();
            Process proceso = runtime.exec("ping www.google.com");

            int estadoSalida = proceso.waitFor(); // Espera a que el proceso termine

            System.out.println("El proceso terminó con estado de salida: " + estadoSalida);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
