package classroom;

public class Persona {

    public long cedula;
    String nombre;
    static int totalPersonas;
    static long defaultCedula = 0;

    static {
        totalPersonas = 0;
        defaultCedula = 0;
    }

    Persona() {
        this("Sin nombre");
    }

    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
        this.nombre = "";
        this.cedula = defaultCedula;
        totalPersonas++;
        defaultCedula++;
    }

    long getCedula() {
        return cedula;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
