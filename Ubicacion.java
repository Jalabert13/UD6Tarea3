import java.util.HashMap;
import java.util.Map;

public class Ubicacion {
    static int id;
    static String descripcion;
    static Map<String, Integer> exits = new HashMap<>();
    public Ubicacion(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public static int getId(){
        return id;
    }

    public static String getDescripcion(){
        return descripcion;
    }

    public static void addExit(String direccion, int idUbicacion){
        exits.put(direccion,idUbicacion);
    }

class main {
    private Map<Integer, Ubicacion> ubicaciones = new HashMap<>();
    Ubicacion uno = new Ubicacion(1, "Estás en la cima de una montaña");
    Ubicacion dos = new Ubicacion(2, "Estás bañándote en la playa" );
    Ubicacion tres = new Ubicacion(3, "Estás dentro de un edificio muy alto");
    Ubicacion cuatro = new Ubicacion(4, "Estás de pie en un puente");
    Ubicacion cinco = new Ubicacion(5, "Estás en un bosque");

        public main() {
            ubicaciones.put(0,  new Ubicacion(0,"Estás sentado en la clase de programación"));
            ubicaciones.put(1,uno);
            ubicaciones.put(2,dos);
            ubicaciones.put(3,tres);
            ubicaciones.put(4,cuatro);
            ubicaciones.put(5,cinco);

        }
    public static void main(String[] args) {

    }

}
}
