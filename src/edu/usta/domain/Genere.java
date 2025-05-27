
package edu.usta.domain;


public class Genere {
    
    private int idGenero;
    private String nombreGenero;
    private String descripcionGenero;

    public Genere() {
    }

    public Genere(int idGenero, String nombreGenero, String descripcionGenero) {
        this.idGenero = idGenero;
        this.nombreGenero = nombreGenero;
        this.descripcionGenero = descripcionGenero;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }

    public String getDescripcionGenero() {
        return descripcionGenero;
    }

    public void setDescripcionGenero(String descripcionGenero) {
        this.descripcionGenero = descripcionGenero;
    }

    @Override
    public String toString() {
        return "Genere{" + "idGenero=" + idGenero + ", nombreGenero=" + nombreGenero + ", descripcionGenero=" + descripcionGenero + '}';
    }
    
    
    
}
