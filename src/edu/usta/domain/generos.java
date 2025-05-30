
package edu.usta.domain;


public class generos {
    
    private int id_genero;
    private String nombre_genero;
    private String descripcion_genero;

    public generos() {
    }

    public generos(int id_genero, String nombre_genero, String descripcion_genero) {
        this.id_genero = id_genero;
        this.nombre_genero = nombre_genero;
        this.descripcion_genero = descripcion_genero;
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public String getNombre_genero() {
        return nombre_genero;
    }

    public void setNombre_genero(String nombre_genero) {
        this.nombre_genero = nombre_genero;
    }

    public String getDescripcion_genero() {
        return descripcion_genero;
    }

    public void setDescripcion_genero(String descripcion_genero) {
        this.descripcion_genero = descripcion_genero;
    }

    @Override
    public String toString() {
        return "generos{" + "id_genero=" + id_genero + ", nombre_genero=" + nombre_genero + ", descripcion_genero=" + descripcion_genero + '}';
    }
    
    

   
    
}
