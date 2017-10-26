package Reportes;
import conexion.Conexion;
import java.sql.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.*;


public class Reporte {
    public String generarReporte(){
     Conexion con = new Conexion();
     Connection cn;
     String mensaje;
     try{
        Class.forName(con.getDriver());
        cn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getClave());
        JasperReport rp = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/Reporte 1.jasper"));
        JasperPrint pr = JasperFillManager.fillReport(rp, null, cn );
        JasperViewer vista= new JasperViewer(pr,false);
        vista.setVisible(true);
        mensaje = "El reporte se a generado exitosamente";
     }catch(Exception e){
         mensaje= e.toString();
     }
     return mensaje;
     
    }
    
    
}
