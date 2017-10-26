package conexion;

/**
 *
 * @author memux
 */
public class Conexion {

    // Atributos
    private String driver;
    private String bd;
    private String url;
    private String usuario;
    private String clave;

    // Getter y setter
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    // Constructores
    public Conexion() {
        driver = "com.mysql.jdbc.Driver";
        bd = "bdplanilla";
        url = "jdbc:mysql://localhost:3306/" + bd;
        usuario = "pma";
        clave = "";
    }

    public Conexion(String driver, String bd, String url, String usuario, String clave) {
        this.driver = driver;
        this.bd = bd;
        this.url = url + this.bd;
        this.usuario = usuario;
        this.clave = clave;
    }

}
