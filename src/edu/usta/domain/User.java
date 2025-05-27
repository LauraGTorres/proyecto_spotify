
package edu.usta.domain;

public class User {
    
    private int idUsuario;
    private int idSuscripcion; 
    private int idRol; 
    private String nombreUsuario;
    private String telefonoUsuario;
    private String correoUsuario;
    private String claveUsuario; 

    public User() {
    }

    public User(int idUsuario, int idSuscripcion, int idRol,String nombreUsuario, String telefonoUsuario,
            String correoUsuario, String claveUsuario) {
        
        this.idUsuario = idUsuario;
        this.idSuscripcion = idSuscripcion;
        this.idRol = idRol;
        this.nombreUsuario = nombreUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.correoUsuario = correoUsuario;
        this.claveUsuario = claveUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(int idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    @Override
    public String toString() {
        return "User{" + "idUsuario=" + idUsuario + ", idSuscripcion=" + idSuscripcion + ", idRol=" + idRol + ", nombreUsuario=" + nombreUsuario + ", telefonoUsuario=" + telefonoUsuario + ", correoUsuario=" + correoUsuario + ", claveUsuario=" + claveUsuario + '}';
    }

    
    
}
