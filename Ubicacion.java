import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Ubicacion {
     int id;
     String descripcion;
     Map<String, Integer> exits = new HashMap<>();

    public Ubicacion(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.exits = new HashMap<String, Integer>();
    }

    public  int getId() {
        return id;
    }

    public  String getDescripcion() {
        return descripcion;
    }
    public Map<String, Integer> getExits(){
        return exits;
    }
    public  void addExit(String direccion, int idUbicacion) {
        exits.put(direccion, idUbicacion);
    }
}

class Main {
    private static Map<Integer, Ubicacion> ubicaciones = new HashMap<>();

    public Main() {
        Ubicacion clase = new Ubicacion(0, "Estás sentado en la clase de programación");
        Ubicacion montanya = new Ubicacion(1, "Estás en la cima de una montaña");
        Ubicacion playa = new Ubicacion(2, "Estás bañándote en la playa");
        Ubicacion edificio = new Ubicacion(3, "Estás dentro de un edificio muy alto");
        Ubicacion puente = new Ubicacion(4, "Estás de pie en un puente");
        Ubicacion bosque = new Ubicacion(5, "Estás en un bosque");
        ubicaciones.put(0, clase);
        ubicaciones.put(1, montanya);
        ubicaciones.put(2, playa);
        ubicaciones.put(3, edificio);
        ubicaciones.put(4, puente);
        ubicaciones.put(5, bosque);


        montanya.addExit("N", 5);
        montanya.addExit("S", 4);
        montanya.addExit("O", 2);
        montanya.addExit("E", 3);
        playa.addExit("N", 5);
        edificio.addExit("O", 1);
        puente.addExit("N", 1);
        puente.addExit("O", 2);
        bosque.addExit("S", 1);
        bosque.addExit("O", 2);

    }

    public static void main(String[] args) {
        Main ubi = new Main();
        Scanner sc = new Scanner(System.in);
        int variable1 = 1;
        boolean variable2 = true;
        boolean repe ;
        while (variable2) {
            System.out.println(ubicaciones.get(variable1).getDescripcion());
            System.out.println("Tus salidas válidas son " + ubicaciones.get(variable1).getExits());
            do {
                repe = true;
                try {
                    System.out.println("¿Hacia donde quieres ir?");
                    String opt = sc.nextLine();
                    if (opt.equals("Q") | opt.equals("q")) {
                        System.out.println("Saliendo...");
                        System.exit(0);
                    }
                    variable1 = ubicaciones.get(variable1).getExits().get(opt.toUpperCase());
                } catch (NullPointerException e) {
                    System.out.println("Este caracter no es valido");
                    repe = false;
                }
            } while (repe == false);
        }
        }
    }




