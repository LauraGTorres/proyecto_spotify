
package edu.usta.domain;


public class Artist {
     private int idArtista;
    private String nombreArtista;

    public Artist() {
    }

    public Artist(int idArtista, String nombreArtista) {
        this.idArtista = idArtista;
        this.nombreArtista = nombreArtista;
    }

    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    @Override
    public String toString() {
        return "Artist{" + "idArtista=" + idArtista + ", nombreArtista=" + nombreArtista + '}';
    }
    
    
    
}
