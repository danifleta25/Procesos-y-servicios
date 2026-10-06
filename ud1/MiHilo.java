package ud1;

public class MiHilo extends Thread{


    @Override
    public void run(){
        String id = Thread.currentThread().getName();

        for (int i = 1; i <= 2; i++){
            System.out.println("Hilo " + id + " trabajando " + i);
            try{
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }

    }

    public static void main(String[] args) {

        MiHilo h1 = new MiHilo();
        MiHilo h2 = new MiHilo();

        h1.start();
        h1.start();

        System.out.println("Jefe Libre mientras ellos trabajan");
    }

}
