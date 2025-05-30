
package edu.usta.domain;

import java.math.BigDecimal;


public class canciones {
    
    private int id_cancion;
    private int id_genero; 
    private int id_artista ;
    private String titulo_cancion;
    private BigDecimal duracion_cancion; 
    private byte[] archivo_cancion;

    public canciones() {
    }

    public canciones(int id_cancion, int id_genero, int id_artista, String titulo_cancion, BigDecimal duracion_cancion, byte[] archivo_cancion) {
        this.id_cancion = id_cancion;
        this.id_genero = id_genero;
        this.id_artista = id_artista;
        this.titulo_cancion = titulo_cancion;
        this.duracion_cancion = duracion_cancion;
        this.archivo_cancion = archivo_cancion;
    }

    public int getId_cancion() {
        return id_cancion;
    }

    public void setId_cancion(int id_cancion) {
        this.id_cancion = id_cancion;
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public int getId_artista() {
        return id_artista;
    }

    public void setId_artista(int id_artista) {
        this.id_artista = id_artista;
    }

    public String getTitulo_cancion() {
        return titulo_cancion;
    }

    public void setTitulo_cancion(String titulo_cancion) {
        this.titulo_cancion = titulo_cancion;
    }

    public BigDecimal getDuracion_cancion() {
        return duracion_cancion;
    }

    public void setDuracion_cancion(BigDecimal duracion_cancion) {
        this.duracion_cancion = duracion_cancion;
    }

    public byte[] getArchivo_cancion() {
        return archivo_cancion;
    }

    public void setArchivo_cancion(byte[] archivo_cancion) {
        this.archivo_cancion = archivo_cancion;
    }

    @Override
    public String toString() {
        return "canciones{" + "id_cancion=" + id_cancion + ", id_genero=" + id_genero + ", id_artista=" + id_artista + ", titulo_cancion=" + titulo_cancion + ", duracion_cancion=" + duracion_cancion + ", archivo_cancion=" + archivo_cancion + '}';
    }
    
    

   
    
    
    
}
