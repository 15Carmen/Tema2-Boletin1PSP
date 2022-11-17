import java.io.File;

public class Hilo extends Thread {

    public void crearHilos() {
        while (true) {

            String nombre = Thread.currentThread().getName();
            System.out.println("Soy el bucle " + nombre + " y estoy trabajando");

            try {
                Thread.sleep((long) (Math.random() * 10000));
            } catch (InterruptedException e) {
                System.out.println("El hilo " + nombre + " ha sido interrumpido.");
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        this.crearHilos();
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Hilo hilo = new Hilo();
            hilo.setName("Hilo " + i);
            hilo.start();
        }
    }
}