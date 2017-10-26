package controlador;

import java.util.*;

/**
 *
 * @author memux
 */
public interface OperacionesEmpleado {

    /*
    En esta interfaz se agregan las operaciones CRUD para el empleado
    Por ser una interfaz, no lleva atributos ni podemos instanciar la misma
     */
    public String agregarEmpleado(Object objeto);

    public String modificarEmpleado(Object objeto);

    public String eliminarEmpleado(Object objeto);

    public ArrayList<Object> mostrarEmpleado();
}
