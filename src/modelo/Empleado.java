package modelo;

/**
 *
 * @author memux
 */
public class Empleado {

    // Atributos
    private int codigoEmpleado;
    private String nombre;
    private int edad;
    private double sueldo;

    // Getter y setter
    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Constructores
    public Empleado() {
    }

    public Empleado(int codigoEmpleado, String nombre, int edad, double sueldo) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

}
