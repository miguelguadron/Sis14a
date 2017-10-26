package controlador;

import conexion.Conexion;
import modelo.Empleado;
import java.util.*;
import java.sql.*;

/**
 *
 * @author memux
 */
public class ControlEmpleado implements OperacionesEmpleado {

    // Constructor vacío
    public ControlEmpleado() {
    }

    // Método que agrega un nuevo registro a la base de datos
    @Override
    public String agregarEmpleado(Object objeto) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pst;
        String sentencia;
        String mensaje = null;
        Empleado emp = (Empleado) objeto;
        try {
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sentencia = "{CALL `insertarEmpleado`(?,?,?,?)}";
            pst = cn.prepareStatement(sentencia);
            pst.setInt(1, emp.getCodigoEmpleado());
            pst.setString(2, emp.getNombre());
            pst.setInt(3, emp.getEdad());
            pst.setDouble(4, emp.getSueldo());
            pst.execute();
            pst.close();
            cn.close();
            mensaje = "Datos insertados correctamente";
        } catch (Exception e) {
            mensaje = e.toString();
        }
        return mensaje;
    }

    // Método que modifica un registro en base al código del empleado
    @Override
    public String modificarEmpleado(Object objeto) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pst;
        String sentencia;
        String mensaje = null;
        Empleado emp = (Empleado) objeto;
        try {
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sentencia = "{CALL `modificarEmpleado`(?,?,?,?)}";
            pst = cn.prepareStatement(sentencia);
            pst.setInt(1, emp.getCodigoEmpleado());
            pst.setString(2, emp.getNombre());
            pst.setInt(3, emp.getEdad());
            pst.setDouble(4, emp.getSueldo());
            pst.execute();
            pst.close();
            cn.close();
            mensaje = "Datos modificados exitosamente";
        } catch (Exception e) {
            mensaje = e.toString();
        }
        return mensaje;
    }

    // Método que elimina un registro en base al código del empleado
    @Override
    public String eliminarEmpleado(Object objeto) {
        Conexion con = new Conexion();
        Connection cn;
        PreparedStatement pst;
        String sentencia;
        String mensaje = null;
        Empleado emp = (Empleado) objeto;
        try {
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            sentencia = "{CALL `eliminarEmpleado`(?)}";
            pst = cn.prepareStatement(sentencia);
            pst.setInt(1, emp.getCodigoEmpleado());
            pst.execute();
            pst.close();
            cn.close();
            mensaje = "Datos eliminados exitosamente";
        } catch (Exception e) {
            mensaje = e.toString();
        }
        return mensaje;
    }

    // Método que muestra los registros de la base de datos
    @Override
    public ArrayList<Object> mostrarEmpleado() {
        Conexion con = new Conexion();
        Connection cn;
        Statement st;
        ResultSet rs;
        String sentencia;
        ArrayList<Object> listaEmpleados = new ArrayList<>();
        try {
            Class.forName(con.getDriver());
            cn = DriverManager.getConnection(con.getUrl(), con.getUsuario(), con.getClave());
            st = cn.createStatement();
            sentencia = "{CALL `mostrarEmpleados`()}";
            rs = st.executeQuery(sentencia);
            while (rs.next()) {
                listaEmpleados.add(new Empleado(
                        rs.getInt("codEmpleado"),
                        rs.getString("nombre"),
                        rs.getInt("edad"),
                        rs.getDouble("sueldo")
                ));
            }
            rs.close();
            st.close();
            cn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return listaEmpleados;
    }

}
