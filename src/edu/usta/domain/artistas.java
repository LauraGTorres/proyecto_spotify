
package edu.usta.domain;


public class artistas {
     private int id_artista;
    private String nombre_artista;

    public artistas() {
    }

    public artistas(int id_artista, String nombre_artista) {
        this.id_artista = id_artista;
        this.nombre_artista = nombre_artista;
    }

    public int getId_artista() {
        return id_artista;
    }

    public void setId_artista(int id_artista) {
        this.id_artista = id_artista;
    }

    public String getNombre_artista() {
        return nombre_artista;
    }

    public void setNombre_artista(String nombre_artista) {
        this.nombre_artista = nombre_artista;
    }

    @Override
    public String toString() {
        return "artistas{" + "id_artista=" + id_artista + ", nombre_artista=" + nombre_artista + '}';
    }

    
    
}
