
package edu.usta.domain;

import java.math.BigDecimal;


public class Song {
    
    private int idCancion;
    private int idGenero; 
    private int idArtista;
    private String tituloCancion;
    private BigDecimal duracionCancion; 
    private byte[] archivoCancion;

    public Song() {
    }

    public Song(int idCancion, int idGenero, int idArtista, String tituloCancion, BigDecimal duracionCancion, byte[] archivoCancion) {
        this.idCancion = idCancion;
        this.idGenero = idGenero;
        this.idArtista = idArtista;
        this.tituloCancion = tituloCancion;
        this.duracionCancion = duracionCancion;
        this.archivoCancion = archivoCancion;
    }

    public int getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    public String getTituloCancion() {
        return tituloCancion;
    }

    public void setTituloCancion(String tituloCancion) {
        this.tituloCancion = tituloCancion;
    }

    public BigDecimal getDuracionCancion() {
        return duracionCancion;
    }

    public void setDuracionCancion(BigDecimal duracionCancion) {
        this.duracionCancion = duracionCancion;
    }

    public byte[] getArchivoCancion() {
        return archivoCancion;
    }

    public void setArchivoCancion(byte[] archivoCancion) {
        this.archivoCancion = archivoCancion;
    }

    @Override
    public String toString() {
        return "Song{" + "idCancion=" + idCancion + ", idGenero=" + idGenero + ", idArtista=" + idArtista + ", tituloCancion=" + tituloCancion + ", duracionCancion=" + duracionCancion + ", archivoCancion=" + archivoCancion + '}';
    }
    
    
    
}
