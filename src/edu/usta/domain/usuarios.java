
package edu.usta.domain;

public class usuarios {
    
    private int id_usuario;
    private int id_suscripcion; 
    private int id_rol ; 
    private String nombre_usuario;
    private String telefono_usuario;
    private String correo_usuario;
    private String clave_usuario;

    public usuarios() {
    }

    public usuarios(int id_usuario, int id_suscripcion, int id_rol, String nombre_usuario, String telefono_usuario, String correo_usuario, String clave_usuario) {
        this.id_usuario = id_usuario;
        this.id_suscripcion = id_suscripcion;
        this.id_rol = id_rol;
        this.nombre_usuario = nombre_usuario;
        this.telefono_usuario = telefono_usuario;
        this.correo_usuario = correo_usuario;
        this.clave_usuario = clave_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_suscripcion() {
        return id_suscripcion;
    }

    public void setId_suscripcion(int id_suscripcion) {
        this.id_suscripcion = id_suscripcion;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getTelefono_usuario() {
        return telefono_usuario;
    }

    public void setTelefono_usuario(String telefono_usuario) {
        this.telefono_usuario = telefono_usuario;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    public String getClave_usuario() {
        return clave_usuario;
    }

    public void setClave_usuario(String clave_usuario) {
        this.clave_usuario = clave_usuario;
    }

    @Override
    public String toString() {
        return "usuarios{" + "id_usuario=" + id_usuario + ", id_suscripcion=" + id_suscripcion + ", id_rol=" + id_rol + ", nombre_usuario=" + nombre_usuario + ", telefono_usuario=" + telefono_usuario + ", correo_usuario=" + correo_usuario + ", clave_usuario=" + clave_usuario + '}';
    }
    
    

   
    
    
}
