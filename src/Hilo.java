public class Hilo extends Thread{
    private String nombre;

    public Hilo(String nombre) {
        super();
        this.nombre = nombre;
    }

    public static void crearHilos(){
        for (int i = 0; i < 5; i++) {
            Hilo nuevoHilo = new Hilo("hilo"+i);
            System.out.println(nuevoHilo.getName());
        }
    }

    @Override
    public void run(){
        this.crearHilos();
        while (true){
            System.out.println("Soy el bucle "+ this.getName() +" y estoy trabajando");
        }

    }

    public static void main(String[] args) {
        Hilo.crearHilos();
    }
}