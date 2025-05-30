
package edu.usta.domain;


public class roles {
    private int id_rol ;
    private String nombre_rol;
    private int estado_rol;

    public roles() {
    }

    public roles(int id_rol, String nombre_rol, int estado_rol) {
        this.id_rol = id_rol;
        this.nombre_rol = nombre_rol;
        this.estado_rol = estado_rol;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre_rol() {
        return nombre_rol;
    }

    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }

    public int getEstado_rol() {
        return estado_rol;
    }

    public void setEstado_rol(int estado_rol) {
        this.estado_rol = estado_rol;
    }

    @Override
    public String toString() {
        return "roles{" + "id_rol=" + id_rol + ", nombre_rol=" + nombre_rol + ", estado_rol=" + estado_rol + '}';
    }
    
    

    
    
    
    
     
    
}
