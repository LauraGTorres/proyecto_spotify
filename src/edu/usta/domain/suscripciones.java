
package edu.usta.domain;


public class suscripciones {
    
    private int id_suscripcion;
    private String nombre_suscripcion;
    private String beneficios_suscripcion;
    private String descripcion_suscripcion;

    public suscripciones() {
    }

    public suscripciones(int id_suscripcion, String nombre_suscripcion, String beneficios_suscripcion, String descripcion_suscripcion) {
        this.id_suscripcion = id_suscripcion;
        this.nombre_suscripcion = nombre_suscripcion;
        this.beneficios_suscripcion = beneficios_suscripcion;
        this.descripcion_suscripcion = descripcion_suscripcion;
    }

    public int getId_suscripcion() {
        return id_suscripcion;
    }

    public void setId_suscripcion(int id_suscripcion) {
        this.id_suscripcion = id_suscripcion;
    }

    public String getNombre_suscripcion() {
        return nombre_suscripcion;
    }

    public void setNombre_suscripcion(String nombre_suscripcion) {
        this.nombre_suscripcion = nombre_suscripcion;
    }

    public String getBeneficios_suscripcion() {
        return beneficios_suscripcion;
    }

    public void setBeneficios_suscripcion(String beneficios_suscripcion) {
        this.beneficios_suscripcion = beneficios_suscripcion;
    }

    public String getDescripcion_suscripcion() {
        return descripcion_suscripcion;
    }

    public void setDescripcion_suscripcion(String descripcion_suscripcion) {
        this.descripcion_suscripcion = descripcion_suscripcion;
    }

    @Override
    public String toString() {
        return "suscripciones{" + "id_suscripcion=" + id_suscripcion + ", nombre_suscripcion=" + nombre_suscripcion + ", beneficios_suscripcion=" + beneficios_suscripcion + ", descripcion_suscripcion=" + descripcion_suscripcion + '}';
    }
    
    

    
    
    
    
}
